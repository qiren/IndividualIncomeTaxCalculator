package qiren.model;

/**
 * @author qiren
 * @version 1.0
 * @created 11-10-2012 13:30:47
 */
public class Beijing extends FiveOneInsuranceFund {

	

	public Beijing(){
		endowmentInsurance = 0.08;
		medicalInsurance = 0.02;
		unemploymentInsurance = 0.002;
		housingFund = 0.12;
		ceil = 14016;
		insuranceFloor = 1869;
		fundFloor = 1160;
	}
	
	public double calculate(double salary) {
		return super.calculate(salary) + 3;
	}

	

}