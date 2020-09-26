package com.virtualpairprogrammers.isbntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	public void checkAValidISBN() { 
		 
		ValidateISBN validator = new ValidateISBN(); 
		boolean result = validator.checkISBN(140449116);
		assertTrue(result);
	}
	
	public void checkAnInvalidISBN() { 
		 
		ValidateISBN validator = new ValidateISBN(); 
		boolean result = validator.checkISBN(140449117);
		assertFalse(result);
	}

}
