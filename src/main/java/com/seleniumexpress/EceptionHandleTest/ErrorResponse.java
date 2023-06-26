package com.seleniumexpress.EceptionHandleTest;

public class ErrorResponse {
	private int statuscode;
	private String status;
	private String message;

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorResponse(int statuscode, String status, String message) {
		super();
		this.statuscode = statuscode;
		this.status = status;
		this.message = message;
	}

	public ErrorResponse() {
		
	}
	}
