package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	
	private Customer customer;
	private Customer other;
	
	@Before
	public void setUp() {
		customer = new Customer(1L, "Nathan", "Farnell");
		other = new Customer(1L, "Nathan", "Farnell");
	}
	
	@Test
	public void settersTest() {
		assertNotNull(customer.getId());
		assertNotNull(customer.getForeName());
		assertNotNull(customer.getSurname());
		
		customer.setId(null);
		assertNull(customer.getId());
		customer.setForeName(null);
		assertNull(customer.getForeName());
		customer.setSurname(null);
		assertNull(customer.getSurname());
		
	}
	
	@Test
	public void equalsWithNull() {
		assertFalse(customer.equals(null));
	}
	
	@Test
	public void equalsWithDifferentObject() {
		assertFalse(customer.equals(new Object()));
	}
	
	@Test
	public void createCustomerWithId() {
		assertEquals(1L, customer.getId(), 0);
		assertEquals("Nathan", customer.getForeName());
		assertEquals("Farnell", customer.getSurname());
	}
	
	@Test
	public void checkEquality() {
		assertTrue(customer.equals(customer));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertTrue(customer.equals(other));
	}
	
	@Test
	public void customerNameNullButOtherNameNotNull() {
		customer.setForeName(null);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void customerNamesNotEqual() {
		other.setForeName("rhys");
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjectsNullName() {
		customer.setForeName(null);
		other.setForeName(null);
		assertTrue(customer.equals(other));
	}
	
	@Test
	public void nullId() {
		customer.setId(null);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void nullIdOnBoth() {
		customer.setId(null);
		other.setId(null);
		assertTrue(customer.equals(other));
	}
	
	@Test
	public void otherIdDifferent() {
		other.setId(2L);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void nullSurname() {
		customer.setSurname(null);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void nullSurnameOnBoth() {
		customer.setSurname(null);
		other.setSurname(null);
		assertTrue(customer.equals(other));
	}
	
	@Test
	public void otherSurnameDifferent() {
		other.setSurname("thompson");
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void constructorWithoutId() {
		Customer customer = new Customer("Chris", "Perrins");
		assertNull(customer.getId());
		assertNotNull(customer.getForeName());
		assertNotNull(customer.getSurname());
	}
	
	@Test
	public void hashCodeTest() {
		assertEquals(customer.hashCode(), other.hashCode());
	}
	@Test
	public void hashCodeTestWithNull() {
		Customer customer = new Customer(null, null);
		Customer other = new Customer(null, null);
		assertEquals(customer.hashCode(), other.hashCode());
	}
	
	@Test
	public void toStringTest() {
		String toString = "id:1 first name:Chris surname:Perrins";
		assertEquals(toString, customer.toString());
	}
}
