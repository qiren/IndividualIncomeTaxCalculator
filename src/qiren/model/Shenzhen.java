package qiren.model;

/**
 * @author qiren
 * @version 1.0
 * @created 11-10-2012 13:30:57
 */
public class Shenzhen extends FiveOneInsuranceFund {
	
	public Shenzhen(){
		this.endowmentInsurance = 0.08;
		this.medicalInsurance = 0.02;
		this.unemploymentInsurance = 0.01;
		this.housingFund = 0.05;
		this.ceil = 12615;
		this.insuranceFloor = 2336;
		FiveOneInsuranceFund.fundFloor = 0;
	}

	
}