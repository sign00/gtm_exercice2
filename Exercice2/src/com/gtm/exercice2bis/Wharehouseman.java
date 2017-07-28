package com.gtm.exercice2bis;

public class Wharehouseman extends Production {

	protected int hours;
	
	public Wharehouseman(String firstName, String lastName, int age, String entryYear, int monthHours) {
		super(firstName, lastName, age, entryYear);
		
		hours = monthHours;
		fixedRate = 65f;
	}

	@Override
	public void computeSalary() {
		
		wages = hours * fixedRate;
	}

}
