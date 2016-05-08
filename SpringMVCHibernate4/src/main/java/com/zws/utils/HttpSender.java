package com.zws.utils;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
/**
 * 
 * @author wensh.zhu
 *
 */
public class HttpSender {
	private static Logger logger = Logger.getLogger(HttpSender.class);
	
	private static HttpSender sender = null;
	
	private CloseableHttpClient client = HttpClients.createDefault();
	
	private HttpSender() {}
	
	public static HttpSender getInstance() {
		if (sender == null)
			sender = new HttpSender();
		return sender;
	}
	
	
	public HttpRespMsg sendByGet(String url)  {
		return sendByGet(url, null);
	}
	public HttpRespMsg sendByGet(String url, Map<String, Object> params) {
		HttpRespMsg respMsg = null;
		if (StringUtils.isEmpty(url))
			return respMsg;
		
		String uri = url + genParamsForGet(params);
		HttpGet get = new HttpGet(uri);
		CloseableHttpResponse resp = null;
		try {
			resp = client.execute(get);
			int code = resp.getStatusLine().getStatusCode();
			String msg = EntityUtils.toString(resp.getEntity());
			respMsg = new HttpRespMsg(code, msg);
		} catch (IOException e) {
			logger.error(e);
		} finally {
			if (resp != null) {
				try {
					resp.close();
				} catch (IOException e) {
					logger.error("CloseableHttpResponse close exception", e);
				}
			}
		}
		logger.info(respMsg);
		
		return respMsg;
	}
	
	public String genParamsForGet(Map<String, Object> params) {
		if (params == null)
			return "";
		StringBuffer buffer = new StringBuffer("?");
		Iterator<String> itor = params.keySet().iterator();
		while (itor.hasNext()) {
			String key = itor.next();
			String value = params.get(key).toString();
			buffer.append(key).append("=").append(value).append("&");
		}
		return buffer.toString();
	}
}
