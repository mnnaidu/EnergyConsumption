package com.oroprise.enc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oroprise.enc.dto.Fraction;
import com.oroprise.enc.exception.ECException;
import com.oroprise.enc.service.FileReader;
import com.oroprise.enc.service.ImportService;

@Service
public class ImportServiceImpl implements ImportService {
	
	@Autowired
	private FileReader fileReader;

	@Override
	public void importFraction() {
		List<String[]> readFile = fileReader.readFile("fraction.csv");
		//List<Fraction> fractions;
		if(readFile ==null) {
			throw new ECException("No data found");
		}
		for (String[] rows : readFile) {
			for (String columns : rows) {
				
			}
		}
	}

	@Override
	public void importMeterReading() {
		fileReader.readFile("meterreading.csv");
	}

}
