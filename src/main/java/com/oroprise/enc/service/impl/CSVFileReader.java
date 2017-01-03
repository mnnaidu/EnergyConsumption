package com.oroprise.enc.service.impl;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.opencsv.CSVReader;
import com.oroprise.enc.exception.FileReadException;

public class CSVFileReader implements com.oroprise.enc.service.FileReader {
	private static final Logger logger = Logger.getLogger(CSVFileReader.class.getName());

	@Override
	public List<String[]> readFile(String file) {
		CSVReader reader = null;
		List<String[]> fileData = null;
		try {
			reader = new CSVReader(new FileReader(file));
			fileData = reader.readAll();
		} catch (IOException e) {
			logger.error("Error Reading file", e);
			throw new FileReadException("Error Reading file");
		} finally {
			if(reader !=null) try { reader.close(); } catch (IOException e) {logger.error("Error closing filereader");}
		}
		return fileData;
	}
	
	
	public static void main(String[] args) {
		com.oroprise.enc.service.FileReader  fileReader = new CSVFileReader();
		List<String[]> fileData = fileReader.readFile("D:\\JavaWorkspace\\EnergyConsumption\\src\\main\\resources\\fraction.csv");
		for (String[] strings : fileData) {
			for (String string : strings) {
				logger.debug(string);
			}
		}
	}
	

     
}
	