package qiren.model;

/**
 * @author qiren
 * @version 1.0
 * @created 11-10-2012 13:30:52
 */
public class Guangzhou extends FiveOneInsuranceFund {

	
	
	public Guangzhou(){
		this.endowmentInsurance = 0.08;
		this.medicalInsurance = 0.02;
		this.unemploymentInsurance = 0.01;
		this.housingFund = 0.08;
		this.ceil = 12303;
		this.insuranceFloor = 2461;
		FiveOneInsuranceFund.fundFloor = 1300;

	}

	
	

}