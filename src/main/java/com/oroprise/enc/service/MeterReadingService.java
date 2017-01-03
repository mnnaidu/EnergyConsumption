package com.oroprise.enc.service;

import java.util.List;

import com.oroprise.enc.dto.MeterReading;

public interface MeterReadingService {

	void createMeterReading(MeterReading meterReading);

	MeterReading getMeterReading(String value);

	List<MeterReading> getAllMeterReading();

	void updateMeterReading(MeterReading meterReading);

	void deleteMeterReading(String id);
}
