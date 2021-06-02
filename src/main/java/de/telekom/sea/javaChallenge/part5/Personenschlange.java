package de.telekom.sea.javaChallenge.part5;

import java.lang.ArrayIndexOutOfBoundsException;

public class Personenschlange extends BaseObject{
	
	private int maxPersonen = 8;
	private Object[] personenListe = new Object[maxPersonen];
	private int anzahlPersonen=0;
	
	public void add(Person person) {     // wenn max. Anzahl Personen erreicht, wird exception geworfen
		if (anzahlPersonen == maxPersonen) throw new ArrayIndexOutOfBoundsException(); 
		else {
		   personenListe[anzahlPersonen] = person;        // neue Person wird hinten angefügt
		   anzahlPersonen++;
		}
	}

    public Person head() {
    	Person p = (Person) personenListe[0];            // erste Person befindet sich immer auf index 0
    	return p;                                        // wenn Liste leer ist wird null zurück gegeben
    }                                                    // Rückgabe null wird beim Aufruf ausgewertet

    public Person remove() {
    	Person p=null;
    	if (anzahlPersonen > 0) {
        	p = (Person) personenListe[0];  // erste Person wird sich für die Rückgabe gemerkt
        	
    	    int i = 0;
    	    for (i=0; i<(anzahlPersonen-1);i++) {
    		    personenListe[i]=personenListe[i+1];// Personen werden alle um 1 Platz nach vorne geschoben
    	    }
    	    anzahlPersonen--;                     // Anzahl um 1 reduziert
    	    personenListe[anzahlPersonen]=null;   // letztes Element auf null gesetzt um wieder Platz zu haben
    	}
    	return p;                           // gibt null zurück wenn nix zu löschen da ist
    }                                       // Rückgabe null wird beim Aufruf ausgewertet

    public void reset() {
    	personenListe = new Object[maxPersonen];  // neue Liste wird angelegt
    	anzahlPersonen = 0;
    	System.out.println("Schlange wurde geleert");
    }

    public boolean empty() {                      // wenn erstes Element leer, dann ist die Gesamtliste leer
    	if (personenListe[0] == null)
    	    return true;
    	else
    		return false;
    }

    public int search(Person person) {           // wenn Person nicht in Liste wird -1 zurück gegeben
    	String vorname=person.getVorname();      // rc = -1 bedeutet nicht gefunden
    	String nachname=person.getNachname();
    	Person p;
    	int rc=-1;
    	
    	for (int i=0; i<anzahlPersonen;i++) {
    	  p = (Person) personenListe[i];	
    	
    	  if (vorname.equals(p.getVorname()) && nachname.equals(p.getNachname())) {
    		  rc = i;
    	  }
    	}
    	
    	return rc;
    }
    
    public Person get(int index) {             // Hilfmethode im einzelne Personen aus Liste zu holen
    	Person p = (Person) personenListe[index];
    	return p;
    }
    
    
    public void getAll() {             // Hilfmethode, zeigt alle Personen aus Liste an
    	if (anzahlPersonen>0) {
          System.out.println("Komplette Liste:");
    	  for (int i=0; i < anzahlPersonen; i++) {
    		  PersonImpl p = (PersonImpl) personenListe[i];
    		  System.out.println(p.getVorname()+" "+p.getNachname());
    	  }
    	}
    	else {
    		System.out.println("Liste ist leer");
    	}
    		
    }
}
