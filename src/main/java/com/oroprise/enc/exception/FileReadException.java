package com.oroprise.enc.exception;

@SuppressWarnings("serial")
public class FileReadException extends RuntimeException {

	private String msg;
	
	public FileReadException() {
	}

	public FileReadException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public FileReadException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	
	
}
