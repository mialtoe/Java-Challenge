package de.telekom.sea.javaChallenge.part4;

public class LetterCount {
	public void countLetter () {
		String poem = String.join( "", 
		        "Whose woods these are I think I know.",
		        "His house is in the village, though;",
		        "He will not see me stopping here",
		        "To watch his woods fill up with snow.",
		        "",
		        "My little horse must think it's queer",
		        "To stop without a farmhouse near",
		        "Between the woods and frozen lake",
		        "The darkest evening of the year.",
		        "",
		        "He gives his harness bells a shake",
		        "To ask if there's some mistake.",
		        "The only other sound's the sweep",
		        "Of easy wind and downy flake.",
		        "",
		        "The woods are lovely, dark, and deep,",
		        "But I have promises to keep,",
		        "And miles to go before I sleep,",
		        "And miles to go before I sleep."
		    );
        
		System.out.println(poem);
		
        poem=poem.toLowerCase();  // alles in Kleinbuchstaben umgewandelt
        
        int count=0;
        int pos;
        char [] alphabet;
        alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int anzahlBuchstabenImAlphabet = 26;
        
        for (int i=0; i<anzahlBuchstabenImAlphabet; i++) {
        	
            for (pos = -1; (pos = poem.indexOf(alphabet[i], pos+1)) != -1; count++);
            
            System.out.println("Buchstabe "+alphabet[i]+" kommt "+count+" mal vor");
            count=0;
            pos=-1;
        }
	}
}
