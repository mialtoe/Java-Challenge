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
		 
		    Person person1 = new Person("Heidi","Klum");
		    Person person2 = new Person("Willi","Wusel");
		    Person person3 = new Person("Paul","Paulsen");
//		    System.out.println(person1.getVorname()+person.getNachname());
		    	    
		    
		    Personenschlange pSchlange = new Personenschlange();
		    System.out.println("XX"+pSchlange.empty());
		    pSchlange.add(person1);
		    pSchlange.add(person2);
		    
		    pSchlange.add(person3);
		    
		    System.out.println("CCC: "+pSchlange.search(person3));
		    
		    
		    pSchlange.getAll();
		    Person head = pSchlange.head();
		    System.out.println("ganz vorne in der Schlange:"+head.getVorname()+head.getNachname());
		    
		    Person removedPerson = pSchlange.remove();
		    System.out.println("aus Schlange entfernt:"+removedPerson.getVorname()+removedPerson.getNachname());
		    pSchlange.getAll();
		    System.out.println("XX"+pSchlange.empty());
		    pSchlange.reset();
		    pSchlange.getAll();
		    System.out.println("XX"+pSchlange.empty());
		    
	 }
	 
	 public static JavaChallengeApp getRootApp () {
			if (theInstance == null) {
			    theInstance = new JavaChallengeApp();
			}
			return theInstance;
	 }
	 
	 		
}
