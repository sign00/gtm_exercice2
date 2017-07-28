package com.gtm.exercice2bis;

public class Representant extends Sales {

	public Representant(String firstName, String lastName, int age, String entryYear, float monthRevenue) {
		super(firstName, lastName, age, entryYear, monthRevenue);		
		
		revenueBase = .2f;
		fixedBase = 800f;
	}
}
