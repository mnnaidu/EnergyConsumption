package com.oroprise.enc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oroprise.enc.res.Response;
import com.oroprise.enc.res.ResposneStatus;
import com.oroprise.enc.service.ImportService;

@RestController
@RequestMapping("/import")
public class ImportController {

	private static final Logger logger = Logger.getLogger(FractionController.class.getName());
	
	@Autowired
	private ImportService importService;

	@RequestMapping(value = "/fraction", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<String> importFraction(HttpServletRequest request) {
		logger.debug("start importMeterReading method");
		importService.importFraction();
		return ResposneStatus.successResponse("Imported Successfully");
	}

	@RequestMapping(value = "/meterreading", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<String> importMeterReading(HttpServletRequest request) {
		logger.debug("start importMeterReading method");
		importService.importMeterReading();
		return ResposneStatus.successResponse("Imported Successfully");
	}
}
