package com.crawler.bean;

import java.util.Map;

/**
 * @author shengri
 * @date 5/1/19
 */
public class HttpResponseWrapper<T> {
    private int statusCode;
    private Map<String, String> headers;
    private long contentLength;

    private T content;

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
