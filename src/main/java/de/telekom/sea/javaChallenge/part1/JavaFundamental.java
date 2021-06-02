package de.telekom.sea.javaChallenge.part1;

public class JavaFundamental {
	
	public void finalTest () {

		// nachfolgender Code geht nicht, da "final" verwendet wird
		// Variablen die mit final declariert sind haben immer denselben Wert (kann nicht verändert werden)
//    	for(final int i = 0; i < 8; i++ ) {                               
//    	    System.out.println( "Geht nicht" );
//    	}
		
		System.out.println("*******************************************************************");
		System.out.println("Challenge Part 1");
		System.out.println("*******************************************************************");
//      funktionierender Code
    	for( int i = 0; i < 2; i++ ) {                               
    	    System.out.println( "Geht nur ohne final" );
    	}

		
	}
}
