package com.gtm.exercice2;

public abstract class Employee {
	
	protected String firstName;
	protected String lastName;
	protected int age;
	protected String entryYear;
	protected float wages;	
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, int age, String entryYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.entryYear = entryYear;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEntryYear() {
		return entryYear;
	}
	public void setEntryYear(String entryYear) {
		this.entryYear = entryYear;
	}	
	public float getWages() {
		return wages;
	}
	public void setWages(float wages) {
		this.wages = wages;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", entryYear="
				+ entryYear + ", wages=" + wages + "]";
	}

	public abstract void computeSalary();	
	
	public String displaySalary() {
	
		computeSalary();	
		return toString();
	}	
}
