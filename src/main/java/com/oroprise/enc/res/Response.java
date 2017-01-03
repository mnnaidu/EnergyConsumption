package com.oroprise.enc.res;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Response<T> implements Serializable {

	private Integer code;

	private String message;

	private T data;

	private List<T> datas;

	public Response() {
	}

	public Response(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public Response(Integer code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Response(Integer code, String message, List<T> datas) {
		super();
		this.code = code;
		this.message = message;
		this.datas = datas;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Response [code=").append(code).append(", message=")
				.append(message).append(", data=").append(data)
				.append(", datas=").append(datas).append("]");
		return builder.toString();
	}
	

}
