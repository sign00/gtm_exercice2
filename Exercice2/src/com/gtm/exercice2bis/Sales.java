package com.gtm.exercice2bis;

public class Sales extends Employee {

	protected float revenue;
	protected float revenueBase;
	protected float fixedBase;
	
	public Sales(String firstName, String lastName, int age, String entryYear, float monthRevenue) {
		super(firstName, lastName, age, entryYear);		
		
		revenue = monthRevenue;
	}
	
	public float getRevenue() {
		return revenue;
	}

	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}

	public float getRevenueBase() {
		return revenueBase;
	}

	public void setRevenueBase(float revenueBase) {
		this.revenueBase = revenueBase;
	}

	public float getFixedBase() {
		return fixedBase;
	}

	public void setFixedBase(float fixedBase) {
		this.fixedBase = fixedBase;
	}	
	
	public void computeSalary() {
		
		wages = revenue * revenueBase + fixedBase; 
	}
}
