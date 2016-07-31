#coding:utf8

import urllib2 
import code
import urllib

def readDataFromUrl(url):
    rqst = urllib2.Request(url)
    opener = urllib2.build_opener()
    urlFile = opener.open(rqst)
    
    return urlFile.data

def readDataFromUrl(url,etag=None,fileHash=None,lastModified=None,userAgent=movie):
    urlparse.

class MovieRedirectHandler(urllib2.HTTPRedirectHandler):
    def http_error_301(self, req, fp, code, msg, headers):
        result = urllib2.HTTPRedirectHandler.http_error_301(self, req, fp, code, msg, headers)
        result.status = code
        return result
    
    def http_error_302(self, req, fp, code, msg, headers):
        rt = urllib2.HTTPRedirectHandler.http_error_302(self, req, fp, code, msg, headers)
        rt.status = code
        return rt
