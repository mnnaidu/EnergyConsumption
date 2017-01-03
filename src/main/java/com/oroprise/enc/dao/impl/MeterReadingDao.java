package com.oroprise.enc.dao.impl;

import org.springframework.stereotype.Repository;

import com.oroprise.enc.dao.AbstractDao;
import com.oroprise.enc.dto.MeterReading;

@Repository
public class MeterReadingDao extends AbstractDao<MeterReading, String> {
	{
		setEntityClzz(MeterReading.class);
	}

	@Override
	public Class<MeterReading> getEntityClzz() {
		return MeterReading.class;
	}

}
