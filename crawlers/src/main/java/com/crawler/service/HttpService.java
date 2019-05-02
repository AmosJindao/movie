package com.crawler.service;

import com.crawler.bean.FileHttpResponse;
import com.crawler.bean.HttpResponseWrapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

/**
 * Date: 4/28/2019
 */
public interface HttpService {

     HttpResponseWrapper getData(String url, Map<String, String> headers, Map<String, String> parameters) throws IOException;

    FileHttpResponse downloadFile(String url) throws IOException;
    FileHttpResponse downloadFile(String fromUrl, String toPathString) throws IOException;
    FileHttpResponse downloadFileToPath(String fromUrl, Path toPath) throws IOException;

}
