package com.oroprise.enc.dao.impl;

import org.springframework.stereotype.Repository;

import com.oroprise.enc.dao.AbstractDao;
import com.oroprise.enc.dto.Fraction;

@Repository
public class FractionDao extends AbstractDao<Fraction, String>  {

	{
		setEntityClzz(Fraction.class);
	}

	@Override
	public Class<Fraction> getEntityClzz() {
		return Fraction.class;
	}
}
