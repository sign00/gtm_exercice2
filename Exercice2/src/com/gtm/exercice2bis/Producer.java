package com.gtm.exercice2bis;

public class Producer extends Production {

	protected int units;
	
	public Producer(String firstName, String lastName, int age, String entryYear, int monthUnits) {
		super(firstName, lastName, age, entryYear);
		 
		units = monthUnits;
		fixedRate = 5f;
	}

	@Override
	public void computeSalary() {
		
		wages = units * fixedRate;
	}

}
