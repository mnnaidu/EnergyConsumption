package com.oroprise.enc.dto;

public class Testa {

	public static void main(String[] args) {
		Fraction fraction =new Fraction();
		fraction.setId(1);
		fraction.setMonth("JAN");
		fraction.setProfile("A");
		fraction.setFraction("0.2");
		
		Fraction fraction1 =new Fraction();
		fraction1.setId(1);
		fraction1.setMonth("JAN");
		fraction1.setProfile("A");
		fraction1.setFraction("0.2");
		
		System.out.println(fraction.equals(fraction1));
	}

}
