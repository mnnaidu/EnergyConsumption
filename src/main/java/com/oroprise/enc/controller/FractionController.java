package com.oroprise.enc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oroprise.enc.dto.Fraction;
import com.oroprise.enc.res.Response;
import com.oroprise.enc.res.ResposneStatus;
import com.oroprise.enc.service.FractionService;

@RestController
@RequestMapping("/fraction")
public class FractionController {

	private static final Logger logger = Logger.getLogger(FractionController.class.getName());
	
	@Autowired
	private FractionService fractionService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Response<String> createFraction(HttpServletRequest request, @RequestBody Fraction fraction) {
		logger.debug("start createFraction method");
		fractionService.createFraction(fraction);
		return ResposneStatus.successResponse("Created Successfully");
	}

	@RequestMapping(value = "/get/{value}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Response<Fraction> getFraction(HttpServletRequest request, @RequestParam String value) {
		logger.debug("start getFraction method");
		return ResposneStatus.successResponse(fractionService.getFraction(value));
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Response<Fraction> getAllFraction(HttpServletRequest request) {
		logger.debug("start getFraction method");
		return ResposneStatus.successResponse(fractionService.getAllFraction());
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Response<String> updateFraction(HttpServletRequest request, @RequestBody Fraction fraction) {
		logger.debug("start updateFraction method");
		fractionService.updateFraction(fraction);
		return ResposneStatus.successResponse("Updated Successfully");
	}

	@RequestMapping(value = "/delete/{value}", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Response<String> deleteFraction(HttpServletRequest request, @RequestParam String value) {
		logger.debug("start updateFraction method");
		fractionService.deleteFraction(value);
		return ResposneStatus.successResponse("Deleted Successfully");
	}

}