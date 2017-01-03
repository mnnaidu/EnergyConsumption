package com.oroprise.enc.service;

import java.util.List;

import com.oroprise.enc.dto.Fraction;

public interface FractionService {

	void createFraction(Fraction fraction);
	
	List<Fraction> getAllFraction();

	Fraction getFraction(String value);

	void updateFraction(Fraction fraction);

	void deleteFraction(String id);

}
