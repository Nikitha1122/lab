package lab10.pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testGetFullName() {
		System.out.println("from TestPerson2");
		Person per = new Person("Robert","King");
		assertEquals("Robert King",per.getFullName());

	}

	/*@Test
	public void testGetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLastName() {
		fail("Not yet implemented");
	}*/
	
	@Test (expected=IllegalArgumentException.class)
	public void testNullsInName()
	{
		System.out.println("from TestPerson2 testing exceptions");
		Person per1 = new Person(null,null);		
		}



}
