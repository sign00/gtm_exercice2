package com.gtm.exercice2;

/*
 * Une facture est caractérisée par une date, une somme en euros, et un libellé représentant la nature de la prestation
 * Les factures dont le libellé commence par "Frais de déplacement - " ne doivent pas être prises en compte dans le calcul du salaire d'un indépendant
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
