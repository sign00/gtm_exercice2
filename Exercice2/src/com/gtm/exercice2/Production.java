package com.gtm.exercice2;

public abstract class Production extends Employee {

	protected float fixedRate;
	protected float riskBonus;
	
	public Production(String firstName, String lastName, int age, String entryYear) {
		super(firstName, lastName, age, entryYear);	
		
		riskBonus = 200f;
	}
	
	public float getFixedRate() {
		return fixedRate;
	}

	public void setFixedRate(float fixedRate) {
		this.fixedRate = fixedRate;
	}

	public float getRiskBonus() {
		return riskBonus;
	}

	public void setRiskBonus(float riskBonus) {
		this.riskBonus = riskBonus;
	}

	@Override
	public abstract void computeSalary();

}
