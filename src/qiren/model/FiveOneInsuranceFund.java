package qiren.model;

/**
 * @author qiren
 * @version 1.0
 * @created 11-10-2012 13:30:51
 */
public abstract class FiveOneInsuranceFund {

	/**
	 * @param salary of double type
	 */
	protected double endowmentInsurance;
	protected double housingFund;
	protected double medicalInsurance;
	protected double unemploymentInsurance;
	protected double ceil;
	protected double insuranceFloor;
	protected static double fundFloor;
	
	
	public static double getFundFloor() {
		return fundFloor;
	}
	
	/**
	 * Calculate five insurance and one fund
	 * @param salary
	 * @return total of double type
	 */
	public double calculate(double salary) {
		double total = 0;	
		if (salary >= ceil)
			total = ceil * (endowmentInsurance + medicalInsurance + housingFund + unemploymentInsurance);
		else if (salary <= min(insuranceFloor, fundFloor))
			total = insuranceFloor * (endowmentInsurance + medicalInsurance + unemploymentInsurance) + housingFund * fundFloor;
		else  {
			if (insuranceFloor >= fundFloor) {
				if (salary < insuranceFloor)
					total = salary * housingFund + insuranceFloor * (endowmentInsurance + medicalInsurance + unemploymentInsurance);
				else
					total = salary * (endowmentInsurance + medicalInsurance + housingFund + unemploymentInsurance);
			} else {
				if (salary >= fundFloor) 
					total = salary * (endowmentInsurance + medicalInsurance + housingFund + unemploymentInsurance);
				else 
					total = salary * (endowmentInsurance + medicalInsurance + unemploymentInsurance) + fundFloor * housingFund;				
			}
		}
		return total;
	}

	private double min(double a, double b) {
		// TODO Auto-generated method stub
	
		return a < b ? a : b;
	}

}