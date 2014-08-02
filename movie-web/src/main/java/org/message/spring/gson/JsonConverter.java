package org.message.spring.gson;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.Assert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * 使用Gson實現對json數據的轉換
 * @author amos
 * @date Jul 27, 2014 8:36:05 PM
 */
public class JsonConverter extends AbstractHttpMessageConverter<Object>
implements GenericHttpMessageConverter<Object> {
	
	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
	
	private GsonBuilder gsonBuilder = new GsonBuilder();
	
	private Gson gson = gsonBuilder.create();
	
	private String jsonPrefix;

	private Boolean prettyPrint;
	
	public JsonConverter() {
		super(new MediaType("application", "json", DEFAULT_CHARSET),
				new MediaType("application", "*+json", DEFAULT_CHARSET));
	}
	
	public void setGsonBuilder(GsonBuilder gsonBuilder) {
		Assert.notNull(gsonBuilder, "gsonBuilder must not be null");
		this.gsonBuilder = gsonBuilder;
		configGson();
	}
	
	public GsonBuilder getGsonBuilder() {
		return gsonBuilder;
	}

	public void setJsonPrefix(String jsonPrefix) {
		this.jsonPrefix = jsonPrefix;
	}
	
	/**
	 * Indicate whether the JSON output by this view should be prefixed with "{} &&". Default is false.
	 * <p>Prefixing the JSON string in this manner is used to help prevent JSON Hijacking.
	 * The prefix renders the string syntactically invalid as a script so that it cannot be hijacked.
	 * This prefix does not affect the evaluation of JSON, but if JSON validation is performed on the
	 * string, the prefix would need to be ignored.
	 * @see #setJsonPrefix
	 */
	public void setPrefixJson(boolean prefixJson) {
		this.jsonPrefix = (prefixJson ? "{} && " : null);
	}

	public void setPrettyPrint(Boolean prettyPrint) {
		this.prettyPrint = prettyPrint;
		configGson();
	}
	
	private void configGson(){
		if(this.prettyPrint != null && this.prettyPrint.booleanValue()){
			gsonBuilder.setPrettyPrinting();
		}
		gson = gsonBuilder.create();
	}
	
	@Override
	public boolean canRead(Class<?> clazz, MediaType mediaType) {
		return canRead(clazz, null, mediaType);
	}
	
	@Override
	public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
		Type collectionType = new TypeToken<Collection<Integer>>(){}.getType();
//		gsonBuilder.
		
		return false;
	}

	@Override
	public Object read(Type type, Class<?> contextClass,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Object readInternal(Class<? extends Object> clazz,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void writeInternal(Object t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		
	}

}
