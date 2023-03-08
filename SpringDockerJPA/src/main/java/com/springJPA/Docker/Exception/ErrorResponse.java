package com.springJPA.Docker.Exception;

import java.sql.Date;

public class ErrorResponse {
	
	private Date timestamp;
	private String message;
	private String details;

	public ErrorResponse(java.util.Date date, String message, String details) {
		super();
		this.timestamp = (Date) date;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
}
