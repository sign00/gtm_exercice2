package com.gtm.exercice2bis;

public class WharehousemanWithRisk extends Wharehouseman {

	public WharehousemanWithRisk(String firstName, String lastName, int age, String entryYear, int monthHours) {
		super(firstName, lastName, age, entryYear, monthHours);
		
	}

	@Override
	public void computeSalary() {
		
		wages = hours * fixedRate + riskBonus;
	}
}
