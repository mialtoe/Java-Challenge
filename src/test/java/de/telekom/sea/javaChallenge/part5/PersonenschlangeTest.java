package de.telekom.sea.javaChallenge.part5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonenschlangeTest {
	private Personenschlange cut;
	
	@BeforeEach
	void setup() {
		cut = new Personenschlange();
	}
	
	@Test             // Gutfall eine Person rein und wieder auslesen
	void add_Test1() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
		cut.add(person1);
		
		//Act
		var result = cut.get(0);
		
		//Assert
		assertEquals(person1, result);
		assertSame(person1, result);
	}
	

	@Test             // Gutfall 8 Personen rein und wieder auslesen
	void add_Test2() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
	    PersonImpl person2 = new PersonImpl("Willi","Wusel");
	    PersonImpl person3 = new PersonImpl("Paul","Paulsen");
	    PersonImpl person4 = new PersonImpl("Paula","Paulchen");
	    PersonImpl person5 = new PersonImpl("Thomas","Müller");
	    PersonImpl person6 = new PersonImpl("Karl","Meier");
	    PersonImpl person7 = new PersonImpl("Sepp","Ferstl");
	    PersonImpl person8 = new PersonImpl("Claudi","Roth");
		cut.add(person1);
		cut.add(person2);
		cut.add(person3);
		cut.add(person4);
		cut.add(person5);
		cut.add(person6);
		cut.add(person7);
		cut.add(person8);
				
		//Act
		var result = cut.get(7);   // Person an letzter Stelle  7 muss person8 sein
		
		//Assert
		assertEquals(person8, result);
		assertSame(person8, result);
	}

	@Test             // Schlechtfall mehr Personen als Max in Liste
	void add_Test3() {
		//Arrange
		String errorClass = "";
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
	    PersonImpl person2 = new PersonImpl("Willi","Wusel");
	    PersonImpl person3 = new PersonImpl("Paul","Paulsen");
	    PersonImpl person4 = new PersonImpl("Paula","Paulchen");
	    PersonImpl person5 = new PersonImpl("Thomas","Müller");
	    PersonImpl person6 = new PersonImpl("Karl","Meier");
	    PersonImpl person7 = new PersonImpl("Sepp","Ferstl");
	    PersonImpl person8 = new PersonImpl("Claudi","Roth");
	    PersonImpl person9 = new PersonImpl("Hansi","Hinterseher");
		cut.add(person1);
		cut.add(person2);
		cut.add(person3);
		cut.add(person4);
		cut.add(person5);
		cut.add(person6);
		cut.add(person7);
		cut.add(person8);
				
		//Act
		Exception e = assertThrows( Exception.class, () -> { cut.add(person9); } );
		errorClass = e.getClass().toString();
		
		//Assert
		assertEquals(errorClass, "class java.lang.ArrayIndexOutOfBoundsException");
	}

	
	@Test   // wer steht vorne in der Schlange?
	void head_Test() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
	    PersonImpl person2 = new PersonImpl("Willi","Wusel");
		cut.add(person1);
		cut.add(person2);
		
		//Act
		Person p = cut.head();

		//Assert
		assertSame(person1, p);
	}
	
	@Test   // Head von leere Schlange ist null
	void head_Test_ohne_Eintrag() {
		//Arrange
		
		//Act
		Person p = cut.head();

		//Assert
		assertSame(null, p);
	}
	
	
	@Test   
	void reset_Test_leer() {
		//Arrange
		
		//Act
		cut.reset();

		//Assert         
		assertSame(null, cut.get(0));   // erstes Element muss leer sein
	}

	@Test   
	void reset_Test() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
		PersonImpl person2 = new PersonImpl("Willi","Wusel");
		cut.add(person1);
		cut.add(person2);
		   
		//Act
		cut.reset();

		//Assert         
		assertSame(null, cut.get(0));   // erstes Element muss leer sein
	}

	@Test   
	void search_Test() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
		PersonImpl person2 = new PersonImpl("Willi","Wusel");
	    PersonImpl person3 = new PersonImpl("Paul","Paulsen");
	    PersonImpl person4 = new PersonImpl("Paula","Paulchen");
		cut.add(person1);
		cut.add(person2);
		cut.add(person3);
	    cut.add(person4);
   
		//Act
		int rc=cut.search(person3);

		//Assert         
		assertSame(2,rc );   // person3 muss Index 2 sein
	}

	@Test   
	void search_Test_ohne_Erfolg() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
		PersonImpl person2 = new PersonImpl("Willi","Wusel");
	    PersonImpl person3 = new PersonImpl("Paul","Paulsen");
	    PersonImpl person4 = new PersonImpl("Paula","Paulchen");
		cut.add(person1);
		cut.add(person2);
		cut.add(person3);
   
		//Act
		int rc=cut.search(person4);

		//Assert         
		assertSame(-1,rc );   // rc ist -1, da nicht in Liste
	}

	@Test   
	void remove_Test_mit_Erfolg() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
		PersonImpl person2 = new PersonImpl("Willi","Wusel");
	    PersonImpl person3 = new PersonImpl("Paul","Paulsen");
	    PersonImpl person4 = new PersonImpl("Paula","Paulchen");
		cut.add(person1);
		cut.add(person2);
		cut.add(person3);
		cut.add(person4);
   
		//Act //Assert
		Person p=cut.remove();
		assertSame(person1,p );   
		p=cut.remove();
		assertSame(person2,p );   
		p=cut.remove();
		assertSame(person3,p );   
		p=cut.remove();
		assertSame(person4,p );   
		
	}

	@Test   
	void remove_Test_ohne_Erfolg() {
		//Arrange
   
		//Act //Assert
		Person p=cut.remove();
		assertSame(null,p );   
	}

	
	@Test   
	void empty_Test_leer() {
		//Arrange
   
		//Act 
		boolean rc=cut.empty();
		
		//Assert
		assertEquals(true, rc);
	}

	@Test   
	void empty_Test_nicht_leer() {
		//Arrange
		PersonImpl person1 = new PersonImpl("Heidi","Klum");
		cut.add(person1);
		
		//Act 
		boolean rc=cut.empty();
		
		//Assert
		assertEquals(false, rc);
	}

	
	
	@AfterEach
	void teardown() {
		cut = null;
	}
	
	
	
}
