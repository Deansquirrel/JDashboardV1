package com.zillion.boot.dashboard.message;

public class SimpleMessage {
	
	private long code;
	private String message;
	
	public static long CODE_SUCCESS =0L;
	public static String MESSAGE_SUCCESS = "success";
	
	public SimpleMessage(){
		this.code = CODE_SUCCESS;
		this.message = MESSAGE_SUCCESS;
	}
	
	public SimpleMessage(long code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
