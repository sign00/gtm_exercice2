package com.gtm.exercice2;

import java.util.ArrayList;
import java.util.Iterator;

public class Staff extends ArrayList<Employee> {

	public void displaySalaries() {
		
		Iterator<Employee> i = this.iterator();
		while(i.hasNext()) 
			System.out.println(i.next().displaySalary());
	}
	
	public void displayAverageSalary() {
		
		Iterator<Employee> i = this.iterator();
		float averageWage = 0f;
		while(i.hasNext()) {
			Employee e = i.next();
			e.computeSalary();
			averageWage += e.getWages(); 
		}
		
		if(this.size() != 0)
			averageWage /= size();
		
		System.out.println("Staff Count: " + this.size() + " Average Salary: " + averageWage);
	}
}
