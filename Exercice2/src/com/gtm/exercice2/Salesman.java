package com.gtm.exercice2;

public class Salesman extends Sales {

	public Salesman(String firstName, String lastName, int age, String entryYear, float monthRevenue) {
		super(firstName, lastName, age, entryYear, monthRevenue);		
		
		revenueBase = .2f;
		fixedBase = 400f;
	}	
}
