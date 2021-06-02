package de.telekom.sea.javaChallenge.part3;

public class Loops {
	
	public void zeigeZaehlschleifen () {
		int i=0;
		
		System.out.println("*******************************************************************");
		System.out.println("Challenge Part 3");
		System.out.println("*******************************************************************");
		System.out.println("Schleife mit while:");
		while (i<8) {
			System.out.println(i);
			i++;
		}
		
		i=0;
		System.out.println("Schleife mit do - while:");
		do {
			System.out.println(i);
			i++;
		} while (i < 8);
	}
}
