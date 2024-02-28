package org.jsp.springbootpersoncar.dto;

public class ResponseStructure<T> {
	private String message;
	private int httpstatus;
	private T data;
	
	

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(int httpstatus) {
		this.httpstatus = httpstatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
