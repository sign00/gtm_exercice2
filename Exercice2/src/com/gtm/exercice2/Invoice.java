package com.gtm.exercice2;

/*
 * Une facture est caract�ris�e par une date, une somme en euros, et un libell� repr�sentant la nature de la prestation
 * Les factures dont le libell� commence par "Frais de d�placement - " ne doivent pas �tre prises en compte dans le calcul du salaire d'un ind�pendant
 */
public class Invoice {
	
	private String date;
	private float amount;
	private String label;
	
	public Invoice(String date, float amount, String label) {
		super();
		this.date = date;
		this.amount = amount;
		this.label = label;
	}

	@Override
	public String toString() {
		return "Invoice [date=" + date + ", amount=" + amount + ", label=" + label + "]";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
}
