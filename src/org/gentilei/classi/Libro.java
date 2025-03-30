package org.gentilei.classi;

import java.util.Locale;

/** 
 * Libro
 * @author Ivan Gentile
 * @version 1.0
 * @since 
 */
/**
 * 
 */
public class Libro {

	
	private String titolo; // Var. di Istanza
	private String autore; // Var. di Istanza
	private int numeroPagine; // Var. di Istanza
	private static double costoPagina = 0.05; // Variabile di classe
	final double COSTO_FISSO = 5.5;
	
	
	/**
	 * Costruttore completo
	 * @param titolo
	 * @param autore
	 * @param numeroPagine
	 */
	public Libro(String titolo, String autore, int numeroPagine) {
		this.titolo = titolo;
		this.autore = autore;
		this.numeroPagine = numeroPagine;
	}
	
	
	/**
	 * Costruttore di copia
	 * @param libro
	 */
	public Libro(Libro libro) {
		this.titolo = libro.titolo;
		this.autore = libro.autore;
		this.numeroPagine = libro.numeroPagine;
	}
	
	
	/**
	 * Costruttore di Defualt
	 */
	public Libro() {
		this.titolo = "";
		this.autore = "";
		this.numeroPagine = 0;
	}
	
	/**
	 * Metodi getter e setter
	 */
	public String getTitolo() {return titolo;}
	public void setTtitolo(String titolo) {this.titolo = titolo;}
	public String getAutore() {return autore;}
	public void setAutore(String autore) {this.autore = autore;}
	public int getNumeroPagine() {return numeroPagine;}
	public void setNumeroPagine(int numeroPagine) {this.numeroPagine = numeroPagine;}	
	public static double getCostoPagina() {return costoPagina;}
	public static void setCostoPagina(double costo) {costoPagina = costo;}
	public  double getCOSTO_FISSO() {return COSTO_FISSO;}
	
	/**
	 * Restituisce il prezzo totale del libro
	 * @return prezzo del libro
	 */
	public double prezzo() {return COSTO_FISSO + numeroPagine * costoPagina;}
	

	
	/**
	 * Restituisce un libro sottoforma di stringa
	 * del tipo "Asimov - Io, Robot - 250 - 12.5€"
	 * @return Stringa con le info sul libro
	 */
	public String toString() {
		// Locale.US stampa il prezzo separando i decimali con il punto e non la virgola
		return String.format(Locale.US,"%s - %s - %d - %.2f€", titolo, autore, numeroPagine, prezzo());
	}
	
	public static void main(String[] args) {
		Libro l1 = new Libro("Pinocchio", "C. Collodi", 150);
		Libro l2 = new Libro("Pollicino", "C. Perrault", 80);
		
		Libro l3 = l1;
		
		//System.out.println(l3.stampa());
		
		l1.setNumeroPagine(200);
		
		
		//System.out.println(l1.getTitolo() + ": " + l1.prezzo());
		System.out.println(l1.toString());
		System.out.println(l3.toString());
		
	}

}
