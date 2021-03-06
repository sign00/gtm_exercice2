package com.gtm.exercice2bis;

public class Main {
	
  public static void main(final String[] args) {
	  
	 if(args.length != 2) {
		
		 System.out.println("Usage: exercice2bis <nom_entreprise1 nom_entreprise2>");
		 System.exit(-1);
	 }	  
	  
    final Staff myEmployees = new Staff();
    myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
    myEmployees.add(new Representant("L�on", "Ventout", 25, "2001", 20000));
    myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
    myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
    myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
    myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
        
    Independent i = new Independent(args[0], "SIREN123456789");
    Invoice invoice = new Invoice("2017-07-27", 12000f, "Formation GTM");
    i.addInvoice(invoice);
    invoice = new Invoice("2017-07-27", 8000f, "Formation Rigolote");
    i.addInvoice(invoice);
    invoice = new Invoice("2017-07-27", 1200f, "Frais de d�placement - Toulouse");
    i.addInvoice(invoice);
    invoice = new Invoice("2017-07-27", 9000f, "Formation Java");
    i.addInvoice(invoice);
    
    myEmployees.add(i);
    
    i = new Independent(args[1], "SIREN567890123");
     invoice = new Invoice("2017-07-27", 15000f, "Formation Windshield");
    i.addInvoice(invoice);
    invoice = new Invoice("2017-07-27", 9000f, "Formation PTC");
    i.addInvoice(invoice);   
    invoice = new Invoice("2017-07-27", 9000f, "Formation Java");
    i.addInvoice(invoice);
    invoice = new Invoice("2017-07-27", 100f, "Frais de d�placement - Paris");
    i.addInvoice(invoice);
    
    myEmployees.add(i);
    
    myEmployees.displaySalaries();
    myEmployees.displayAverageSalary();    
  }
}