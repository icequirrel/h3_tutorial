package com.virtualpairprogrammers.isbntools;
import static org.junit.Assert.*; 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	public void checkAValidISBN() { 
		 
		ValidateISBN validator = new ValidateISBN(); 
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first value",result);
		result = validator.checkISBN("0140177396"); 
		assertTrue("second value", result);
	}
	
	@Test
	public void checkAnInvalidISBN() { 
		 
		ValidateISBN validator = new ValidateISBN(); 
		boolean result = validator.checkISBN("0140449117");
		//fail();
		assertFalse(result);
	}

}
