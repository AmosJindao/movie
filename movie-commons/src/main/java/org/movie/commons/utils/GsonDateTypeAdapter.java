package org.movie.commons.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * @author amos
 * @date Aug 2, 2014 11:14:43 AM
 */
public final class GsonDateTypeAdapter extends TypeAdapter<Date> {
	public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
		// we use a runtime check to make sure the 'T's equal
		@SuppressWarnings("unchecked")
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
			return typeToken.getRawType() == Date.class ? (TypeAdapter<T>) new DateTypeAdapter()
					: null;
		}
	};

	private final DateFormat enUsFormat = DateFormat.getDateTimeInstance(
			DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
	private DateFormat localFormat = DateFormat.getDateTimeInstance(
			DateFormat.DEFAULT, DateFormat.DEFAULT);
	private final DateFormat iso8601Format = buildIso8601Format();

	private static DateFormat buildIso8601Format() {
		DateFormat iso8601Format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
		iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
		return iso8601Format;
	}
	
	public void setLocalFormat(String pattern){
		localFormat = new SimpleDateFormat(pattern);
	}

	@Override
	public Date read(JsonReader in) throws IOException {
		if (in.peek() == JsonToken.NULL) {
			in.nextNull();
			return null;
		}
		return deserializeToDate(in.nextString());
	}

	private synchronized Date deserializeToDate(String json) {
		try {
			return new Date(Long.parseLong(json));
		} catch (NumberFormatException e) {
		}
		try {
			return localFormat.parse(json);
		} catch (ParseException ignored) {
		}
		try {
			return enUsFormat.parse(json);
		} catch (ParseException ignored) {
		}
		try {
			return iso8601Format.parse(json);
		} catch (ParseException e) {
			throw new JsonSyntaxException(json, e);
		}
	}

	@Override
	public synchronized void write(JsonWriter out, Date value)
			throws IOException {
		if (value == null) {
			out.nullValue();
			return;
		}
		String dateFormatAsString = enUsFormat.format(value);
		out.value(dateFormatAsString);
	}
}
