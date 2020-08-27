package com.zillion.boot.dashboard.message;

public class RespMessage<T> extends SimpleMessage {
	
	private T data;
	
	public RespMessage(){}
	
	public RespMessage(T t) {
		this.data = t;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
