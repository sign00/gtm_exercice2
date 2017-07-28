package com.gtm.exercice2bis;

import java.util.ArrayList;
import java.util.Iterator;

public class Staff extends ArrayList<PayRoll> {

	public void displaySalaries() {
		
		Iterator<PayRoll> i = this.iterator();
		while(i.hasNext()) 
			System.out.println(i.next().displaySalary());
	}
	
	public void displayAverageSalary() {
		
		Iterator<PayRoll> i = this.iterator();
		float averageWage = 0f;
		while(i.hasNext()) {
			PayRoll pr = i.next();
			pr.computeSalary();
			averageWage += pr.getWages(); 
		}
		
		if(this.size() != 0)
			averageWage /= size();
		
		System.out.println("Staff Count: " + this.size() + " Average Salary: " + averageWage);
	}
}
