package com.oroprise.enc.exception;

@SuppressWarnings("serial")
public class ECException extends RuntimeException {

	private String msg;

	public ECException() {
	}

	public ECException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public ECException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
}
