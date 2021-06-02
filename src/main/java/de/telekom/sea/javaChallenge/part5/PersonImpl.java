package de.telekom.sea.javaChallenge.part5;

public class PersonImpl implements Person{
	
	private String vorname;
	private String nachname;
	
	public PersonImpl() {}   // Konstruktor 
	
	public PersonImpl(String vorname, String nachname) {   // Konstruktor
		this.vorname= vorname;
		this.nachname= nachname;
	}   
	
	public String getVorname() {
		return this.vorname;
	}
	
    public String getNachname() {
    	return this.nachname;
    }
	
}
