package com.gtm.exercice2bis;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Ils sont caractérisés par un nom et un numéro SIREN, ainsi qu'une liste de facture pour le mois courant
 * L'équivalent de leur salaire se calcul avec la somme des factures qui lui sont associées
 */
public class Independent implements PayRoll {

	private String name;
	private String siren;
	private ArrayList<Invoice> invoices;	
	private String TRAVEL_COST = "Frais de déplacement - ";
	protected float wages;	
	
	public Independent(String name, String siren) {
		super();
		this.name = name;
		this.siren = siren;
		invoices = new ArrayList<Invoice>();
	}

	public void addInvoice(Invoice invoice) {
		
		invoices.add(invoice);
	}
	
	public String getSiren() {
		return siren;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	@Override
	public void computeSalary() {
		
		// for(final Invoice inv : this.invoices) { }
		
		Iterator<Invoice> i = invoices.iterator();
		wages = 0f;
		while(i.hasNext()) {
			Invoice inv = i.next();
			if(inv.getLabel().startsWith(TRAVEL_COST) == false)
				wages += inv.getAmount();
		}			
	}

	@Override
	public String toString() {
		return "Independent [name=" + name + ", siren=" + siren + ", wages=" + wages + "]";
	}
	
	@Override
	public String displaySalary() {
		
		computeSalary();	
		return toString();
	}	
	
	@Override
	public float getWages() {
		return wages;	
	}
}
