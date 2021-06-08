package de.telekom.sea.javaChallenge.part5g;

import java.lang.ArrayIndexOutOfBoundsException;
import java.util.ArrayList;

import de.telekom.sea.javaChallenge.part5.*;

public class PersonenschlangeGen extends BaseObject{
	
	private int maxPersonen = 8;
	private ArrayList<Person> personenListe = new ArrayList<Person>();
	private int anzahlPersonen=0;
	
	public void add(Person person) {     // wenn max. Anzahl Personen erreicht, wird exception geworfen
		if (anzahlPersonen == maxPersonen) throw new ArrayIndexOutOfBoundsException(); 
		else {
		   personenListe.add(person);
		   anzahlPersonen++;
		}
	}

    public Person head() {
        Person p = personenListe.get(0); 	
    	return p;                                        // wenn Liste leer ist wird null zurück gegeben
    }                                                    // Rückgabe null wird beim Aufruf ausgewertet

	public Person remove() {
		Person p = null;
		if (anzahlPersonen > 0) {
			p = (Person) personenListe.get(0); // erste Person wird sich für die Rückgabe gemerkt
            personenListe.remove(0);  // erste Person aus Liste gelöscht
			anzahlPersonen--; // Anzahl um 1 reduziert
		}
		
		return p; // gibt null zurück wenn nix zu löschen da ist
	}                                // Rückgabe null wird beim Aufruf ausgewertet

    public void reset() {
    	personenListe = new ArrayList<Person>();// neue Liste wird angelegt
    	anzahlPersonen = 0;
    	System.out.println("Schlange wurde geleert");
    }

	public boolean empty() { // wenn erstes Element leer, dann ist die Gesamtliste leer
		if (personenListe.isEmpty())
			return true;
		else
			return false;
	}

	public int search(Person person) { // wenn Person nicht in Liste wird -1 zurück gegeben
		String vorname = person.getVorname(); // index = -1 bedeutet nicht gefunden
		String nachname = person.getNachname();
		int rc = -1;
		int index = 0;

		for (Person p : personenListe) {
			if (vorname.equals(p.getVorname()) && nachname.equals(p.getNachname())) {
				rc = index;
			}
			index++;
		}

		return rc;
	}
    
    public Person get(int index) {             // Hilfmethode im einzelne Personen aus Liste zu holen
    	Person p = personenListe.get(index);
    	return p;
    }
    
    
	public void getAll() { // Hilfmethode, zeigt alle Personen aus Liste an
		if (anzahlPersonen > 0) {
			System.out.println("Komplette Liste:");
			for (Person p : personenListe) {
				System.out.println(p.getVorname() + " " + p.getNachname());
			}
		} else {
			System.out.println("Liste ist leer");
		}

	}
}
