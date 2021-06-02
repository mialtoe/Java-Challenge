package de.telekom.sea.javaChallenge;




public class Main {

	public static void main(String[] args) {
        
		
		try { 
			JavaChallengeApp app=JavaChallengeApp.getRootApp();
	                 
	          app.setParent(null);
	          app.run(args);
	       }
	       catch (Exception anyException) {
	    	   System.out.println("Es ist ein Fehler aufgetreten, deshalb wird das Programm jetzt kontrolliert beendet.");
	    	   anyException.printStackTrace();
	       }
		
//		Person person= new Person();
		
	}

}
