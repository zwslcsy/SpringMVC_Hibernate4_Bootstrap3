package com.zws.utils;
/**
 * 
 * @author wensh.zhu
 *
 */
public class HttpRespMsg {
	public HttpRespMsg() {}
	public HttpRespMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	private int code;
	private String msg;
	@Override
	public String toString() {
		return "HttpRespMsg [code=" + code + ", msg=" + msg + "]";
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
