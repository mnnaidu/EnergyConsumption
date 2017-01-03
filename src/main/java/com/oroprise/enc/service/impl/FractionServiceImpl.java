package com.oroprise.enc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oroprise.enc.dao.impl.FractionDao;
import com.oroprise.enc.dto.Fraction;
import com.oroprise.enc.service.FractionService;

@Service
public class FractionServiceImpl implements FractionService {

	@Autowired
	private FractionDao fractionDao;
	
	@Override
	public void createFraction(Fraction fraction) {
		fractionDao.create(fraction);
	}

	@Override
	public List<Fraction> getAllFraction() {
		return fractionDao.getAll();
	}
	
	@Override
	public Fraction getFraction(String value) {	
		return fractionDao.get(value);
	}
	
	@Override
	public void updateFraction(Fraction fraction) {
		fractionDao.update(fraction);
	}

	@Override
	public void deleteFraction(String id) {
		fractionDao.delete(id);
	}


}
