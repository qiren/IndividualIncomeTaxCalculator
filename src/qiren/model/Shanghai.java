package qiren.model;

/**
 * @author qiren
 * @version 1.0
 * @created 11-10-2012 13:30:55
 */
public class Shanghai extends FiveOneInsuranceFund {
	
	public Shanghai(){
		this.endowmentInsurance = 0.08;
		this.medicalInsurance = 0.02;
		this.unemploymentInsurance = 0.01;
		this.housingFund = 0.07;
		this.ceil = 12993;
		this.insuranceFloor = 2598;
		FiveOneInsuranceFund.fundFloor = 1280;
	}	

}