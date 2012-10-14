package com.qiren;

/**
 * @author qiren
 * @version 1.0
 * @created 11-10-2012 13:30:57
 */
public class Shenzhen implements FiveOneInsuranceFund {

	private double endowmentInsurance;
	private double housingFund;
	private double medicalInsurance;
	private double unemploymentInsurance;
	private double ceil;
	
	public Shenzhen(){
		this.endowmentInsurance = 0.08;
		this.medicalInsurance = 0.02;
		this.unemploymentInsurance = 0.01;
		this.housingFund = 0.05;
		this.ceil = 11682;
	}

	public void finalize() throws Throwable {

	}

	/*
	 * @param salary of double argument
	 * @return total of five one insurance fund
	 * @see com.qiren.FiveOneInsuranceFund#calculate(double)
	 */
	public double calculate(double salary) {
		double total = 0;
		if (salary < ceil)
			total = salary * (endowmentInsurance + medicalInsurance + housingFund + unemploymentInsurance);
		else 
			total = ceil * (endowmentInsurance + medicalInsurance + housingFund + unemploymentInsurance);
		return total;
	}

}