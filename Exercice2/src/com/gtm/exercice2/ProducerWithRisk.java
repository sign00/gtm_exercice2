package com.gtm.exercice2;

public class ProducerWithRisk extends Producer {

	public ProducerWithRisk(String firstName, String lastName, int age, String entryYear, int monthUnits) {
		super(firstName, lastName, age, entryYear, monthUnits);		
	}

	@Override
	public void computeSalary() {
		
		wages = units * fixedRate + riskBonus;
	}
}
