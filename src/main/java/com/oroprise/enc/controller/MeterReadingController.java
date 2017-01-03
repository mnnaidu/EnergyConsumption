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

import com.oroprise.enc.dto.MeterReading;
import com.oroprise.enc.res.Response;
import com.oroprise.enc.res.ResposneStatus;
import com.oroprise.enc.service.MeterReadingService;

@RestController
@RequestMapping("/meterreading")
public class MeterReadingController {

	private static final Logger logger = Logger.getLogger(MeterReadingController.class.getName());
	
	@Autowired
	private MeterReadingService meterReadingService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<String> createMeterReading(HttpServletRequest request, @RequestBody MeterReading meterReading) {
		logger.debug("start createMeterReading method");
		meterReadingService.createMeterReading(meterReading);
		return ResposneStatus.successResponse("Created Successfully");
	}

	@RequestMapping(value = "/get/{value}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<MeterReading> getMeterReading(HttpServletRequest request, @RequestParam String value) {
		logger.debug("start getMeterReading method");
		return ResposneStatus.successResponse(meterReadingService.getMeterReading(value));
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<MeterReading> getAllMeterReading(HttpServletRequest request) {
		logger.debug("start getAllMeterReading method");
		return ResposneStatus.successResponse(meterReadingService.getAllMeterReading());
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<String> updateMeterReading(HttpServletRequest request, @RequestBody MeterReading meterReading) {
		logger.debug("start updateMeterReading method");
		meterReadingService.updateMeterReading(meterReading);
		return ResposneStatus.successResponse("Updated Successfully");
	}

	@RequestMapping(value = "/delete/{value}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<String> deleteMeterReading(HttpServletRequest request, @RequestParam String value) {
		logger.debug("start updateMeterReading method");
		meterReadingService.deleteMeterReading(value);
		return ResposneStatus.successResponse("Deleted Successfully");
	}

}
