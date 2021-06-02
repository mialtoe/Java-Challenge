package de.telekom.sea.javaChallenge.part5;

public class Personenschlange {
	
	private int maxPersonen = 8;
	private Object[] personenListe = new Object[maxPersonen];
	private int anzahlPersonen=0;
	
	public void add(Person person) {
		personenListe[anzahlPersonen] = person;
		anzahlPersonen++;
	}

    public Person head() {
    	Person p = (Person) personenListe[0];
    	return p;
    }

    public Person remove() {
    	Person p = (Person) personenListe[0];
    	int i = 0;
    	for (i=0; i<anzahlPersonen;i++) {
    		personenListe[i]=personenListe[i+1];
    	}
    	personenListe[i]=null;
    	anzahlPersonen--;
    	return p;
    }

    public void reset() {
    	personenListe = new Object[maxPersonen];
    	anzahlPersonen = 0;
    	System.out.println("Schlange wurde geleert");
    }

    public boolean empty() {
    	if (personenListe[0] == null)
    	    return true;
    	else
    		return false;
    }

    public int search(Person person) {
    	String vorname=person.getVorname();
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
    
    public void getAll() {
    	if (anzahlPersonen>0) {
    	  for (int i=0; i < anzahlPersonen; i++) {
    		  Person p = (Person) personenListe[i];
    		  System.out.println(p.getVorname()+p.getNachname());
    	  }
    	}
    	else {
    		System.out.println("Liste ist leer");
    	}
    		
    }
}
