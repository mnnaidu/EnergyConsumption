package com.oroprise.enc.res;

import java.util.List;

public class ResposneStatus {
	
	public static <T> Response<T> successResponse() {
		return new Response<T>(200, "Proccessed Successfully");
	}
	
	public static <T> Response<T> successResponse(T t) {
		return new Response<T>(200, "Proccessed Successfully", t);
	}
	
	public static <T> Response<T> successResponse(List<T> t) {
		return new Response<T>(200, "Proccessed Successfully", t);
	}
	
	public static <T> Response<T> errorResponse() {
		return new Response<T>(200, "Proccess Failure");
	}

}
