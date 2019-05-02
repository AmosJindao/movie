package com.crawler.service;

import com.crawler.bean.FileHttpResponse;
import com.crawler.bean.HttpResponseWrapper;
import com.crawler.bean.StringHttpResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 4/28/2019
 */
public class HttpServiceImpl /*implements HttpService */{

//    @Override
    public HttpResponseWrapper getData(String url, Map<String, String> headers, Map<String, String> parameters) throws IOException {
        StringHttpResponse stringHttpResponse = new StringHttpResponse();


        CloseableHttpResponse response1 = getResponse(url, headers, parameters);
// The underlying HTTP connection is still held by the response object
// to allow the response content to be streamed directly from the network socket.
// In order to ensure correct deallocation of system resources
// the user MUST call CloseableHttpResponse#close() from a finally clause.
// Please note that if response content is not fully consumed the underlying
// connection cannot be safely re-used and will be shut down and discarded
// by the connection manager.
        try {
//            System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();
            // do something useful with the response body
            // and ensure it is fully consumed
//            EntityUtils.consume(entity1);
            stringHttpResponse.setContent(EntityUtils.toString(entity1));

            populateHttpResponse(response1, stringHttpResponse);
        } finally {
            response1.close();
        }

        return stringHttpResponse;
    }

    public FileHttpResponse downloadFile(String url) throws IOException {
        return downloadFileToPath(url, (Path) null);
    }

    public FileHttpResponse downloadFile(String fromUrl, String toPathString) throws IOException {
        if (StringUtils.isBlank(toPathString)) {
            return downloadFileToPath(fromUrl, Paths.get(toPathString));
        } else {
            return downloadFileToPath(fromUrl, (Path) null);
        }
    }

    public FileHttpResponse downloadFileToPath(String fromUrl, Path toPath) throws IOException {
        if (StringUtils.isBlank(fromUrl)) {
            return null;
        }

        Path target = toPath;

        if (target == null) {
            target = Files.createTempFile("netD_", null);
        }

        CloseableHttpResponse closeableHttpResponse = getResponse(fromUrl, null, null);
        try {
            FileHttpResponse fileHttpResponse = new FileHttpResponse();

            if (closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
                Files.copy(closeableHttpResponse.getEntity().getContent(), target, StandardCopyOption.REPLACE_EXISTING);

                fileHttpResponse.setContent(target);
            }

            populateHttpResponse(closeableHttpResponse, fileHttpResponse);

            return fileHttpResponse;
        } finally {
            closeableHttpResponse.close();
        }
    }

    private CloseableHttpResponse getResponse(String url, Map<String, String> headers, Map<String, String> parameters) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse response = httpclient.execute(httpGet);

        return response;
    }

    private <T> void populateHttpResponse(HttpResponse httpResponse, HttpResponseWrapper<T> wrapper) {
        if (httpResponse.getStatusLine() != null) {
            wrapper.setStatusCode(httpResponse.getStatusLine().getStatusCode());
        }


        HttpEntity httpEntity = httpResponse.getEntity();
        if (httpEntity != null) {
            Map<String, String> headers = new HashMap<>();

            Header ctHeader = httpEntity.getContentType();
            if (ctHeader != null) {
                headers.put(ctHeader.getName(), ctHeader.getValue());
            }

            Header ceHeader = httpEntity.getContentEncoding();
            if (ceHeader != null) {
                headers.put(ctHeader.getName(), ctHeader.getValue());
            }

            wrapper.setHeaders(headers);

            wrapper.setContentLength(httpEntity.getContentLength());
        }
    }
}
