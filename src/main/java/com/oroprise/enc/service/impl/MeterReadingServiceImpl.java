package com.oroprise.enc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oroprise.enc.dao.impl.MeterReadingDao;
import com.oroprise.enc.dto.MeterReading;
import com.oroprise.enc.service.MeterReadingService;

@Service
public class MeterReadingServiceImpl implements MeterReadingService {

	@Autowired
	private MeterReadingDao meterReadingDao;
	
	@Override
	public void createMeterReading(MeterReading meterReading) {
		meterReadingDao.create(meterReading);
	}

	@Override
	public List<MeterReading> getAllMeterReading() {
		return meterReadingDao.getAll();
	}
	
	@Override
	public MeterReading getMeterReading(String value) {	
		return meterReadingDao.get(value);
	}
	
	@Override
	public void updateMeterReading(MeterReading meterReading) {
		meterReadingDao.update(meterReading);
	}

	@Override
	public void deleteMeterReading(String id) {
		meterReadingDao.delete(id);
	}


}
