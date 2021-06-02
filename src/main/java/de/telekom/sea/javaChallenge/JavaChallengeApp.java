package de.telekom.sea.javaChallenge;

import java.io.IOException;

import de.telekom.sea.javaChallenge.part1.*;
import de.telekom.sea.javaChallenge.part2.*;
import de.telekom.sea.javaChallenge.part3.*;
import de.telekom.sea.javaChallenge.part4.*;
import de.telekom.sea.javaChallenge.part5.*;
import java.io.IOException;



public class JavaChallengeApp extends BaseObject{
	private static JavaChallengeApp theInstance;
	 
	 private JavaChallengeApp() {    // constructor
	 }
	  
	 public void run(String[] args) throws IOException {
		// Challenge Part 1 - java Fundamentals
//			JavaFundamental javaFundamental = new JavaFundamental ();
//			javaFundamental.finalTest();

			// Challenge Part 2 - Datentypen
//			Datentypen datentypen= new Datentypen();
//			datentypen.zeigeDatentypen();

			// Challenge Part 3 - while / do while
//			Loops loops=new Loops();
//			loops.zeigeZaehlschleifen();
			
			// Challenge Part 4 - Zähle Buchstaben
//			LetterCount letterCount=new LetterCount();
//			letterCount.countLetter();
		 
		    // Challenge Part 5 
		    Personenschlange pSchlange = new Personenschlange();

		    // Personen für Schlange komplett initialisieren   
		    PersonImpl person1 = new PersonImpl("Heidi","Klum");
		    PersonImpl person2 = new PersonImpl("Willi","Wusel");
		    PersonImpl person3 = new PersonImpl("Paul","Paulsen");
		    PersonImpl person4 = new PersonImpl("Paula","Paulchen");
		    PersonImpl person5 = new PersonImpl("Thomas","Müller");
		    PersonImpl person6 = new PersonImpl("Karl","Meier");
		    PersonImpl person7 = new PersonImpl("Sepp","Ferstl");
		    PersonImpl person8 = new PersonImpl("Claudi","Roth");
		    PersonImpl person9 = new PersonImpl("Hansi","Hinterseher");

		    // nochmal nachsehen ob Schlange wirklich leer
		    if (pSchlange.empty())
		    	System.out.println("Schlange ist leer");
		    else 
		    	System.out.println("Schlange ist nicht leer");
		    	
		    // Test Löschen aus leerer Liste
		    Person tryremove = pSchlange.remove();
		    if (tryremove == null)
		    	System.out.println("Schlange leer, kein remove möglich");
		    
		    // jetzt 8 Personen in die Schlange
		    pSchlange.add(person1);
		    pSchlange.add(person2);
		    pSchlange.add(person3);
		    pSchlange.add(person4);
		    pSchlange.add(person5);
		    pSchlange.add(person6);
		    pSchlange.add(person7);
		    pSchlange.add(person8);
		    // und noch ein Versuch einer 9. Person
		    try {
		      pSchlange.add(person9);
		    } catch (IndexOutOfBoundsException e) {
		         System.out.println("kein Platz mehr in der Liste für Person 9");	
		    }
		    
		 // jetzt ist die Schlange nicht mehr leer
		    if (pSchlange.empty())
		    	System.out.println("Schlange ist leer");
		    else 
		    	System.out.println("Schlange ist nicht mehr leer");
		    
		    // an wievielter Stelle befindet sich Paul Paulsen?
		    System.out.println(String.format("gesuchte Person %s %s befindet sich an Stelle %s",person3.getVorname(),person3.getNachname(),(pSchlange.search(person3)+1)));

		    // komplette Schlange anzeigen
		    pSchlange.getAll();
		    
		    // wer steht ganz vorne in der Schlange
		    Person head = pSchlange.head();
		    System.out.println(String.format("ganz vorne in der Schlange: %s %s",head.getVorname(),head.getNachname()));
		    
		    // erste aus Schlange entfernen
		    Person removedPerson = pSchlange.remove();
		    System.out.println(String.format("aus Schlange entfernt: %s %s",removedPerson.getVorname(),removedPerson.getNachname()));
		    
		    // wieder komplette Schlange ausgeben zur Kontrolle
		    pSchlange.getAll();
		    
		    // ist die Schlange leer?
		    System.out.println(String.format("Schlange leer?: %s",pSchlange.empty()));
		    // Schlange jetzt leeren
		    pSchlange.reset();
		    // prüfen ob Schlange leer
		    pSchlange.getAll();
		    System.out.println(String.format("Schlange leer?: %s",pSchlange.empty()));
		    
	 }
	 
	 public static JavaChallengeApp getRootApp () {
			if (theInstance == null) {
			    theInstance = new JavaChallengeApp();
			}
			return theInstance;
	 }
	 
	 		
}
