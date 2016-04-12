package fr.demos.web;

import java.io.Serializable;

public class Climatisation implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*
Les informations contenues:
• temperature (mesurée en degré Celsius) 
• pression (en hectoPascal) 
• taux d’humidité (un simple pourcentage) 
• une estampille de datation (un "timestamp" exprimé sous forme de long). 
• le nom de l’appareil émetteur (qui crée la donnée). 
*/	
	
	


    private String nomAppareil;
	private double temperature; 
	private double pression;
	private int tauxHumidite;
	private long datation =  System.currentTimeMillis();	
	private static final int  ajoutFarenheit = 40;
    private static final double  facteurFarenheit =  1.8;
	private static final double facteurConversion = 0.0295299831;
	
	
	
	


	public String getNomAppareil() {
		return nomAppareil;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getPression() {
		return pression;
	}

	public int getTauxHumidite() {
		return tauxHumidite;
	}

	public long getDatation() {
		return datation;
	}

	
	
	public Climatisation( String n, double p, double t, int h ){ 
//		 datation = System.currentTimeMillis();
		 
//	    this(n,t,h);
	 this.nomAppareil = n;
     this.pression = p;
	 this.temperature = t;
	 this.tauxHumidite = h;
		 
		 
		 
	 }
	
	public Climatisation( String n, double t, int h ){ 
//		 datation = System.currentTimeMillis();
		 
         this(n,0,t,h);
//		 this.nomAppareil = n;
//		 this.temperature = t;
//		 this.tauxHumidite = h;
		 
		 
		 
	 }

	

	public double getTemperatureFarenheit() {
		
		
	return	 (((temperature + ajoutFarenheit)*facteurFarenheit)- ajoutFarenheit);
		
	}

	
	public double getPressionPoucesMercure(){
		return Math.rint(100*this.pression*facteurConversion)/100;
		
	}
	
	


	@Override
	public String toString() {
		return "[ nomAppareil = " + nomAppareil + ", temperature = " + temperature + ", pression = " + pression
				+ ", tauxHumidite = " + tauxHumidite + ", datation = " + new java.util.Date(datation) + "]";
	}
	
}
