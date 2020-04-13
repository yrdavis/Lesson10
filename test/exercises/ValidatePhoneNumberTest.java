package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * @author Yvonne Davis
 * @version 1
 * This program checks the method that validates North American phone numbers to verify it is correct
 * 
 */

class ValidatePhoneNumberTest {

	@Test

	public void testPhoneNumber() {
		assertTrue(ValidatePhoneNumber.validPhoneNumber("185-673-4129"));
		assertFalse(ValidatePhoneNumber.validPhoneNumber("05.673.0112"));
		assertTrue(ValidatePhoneNumber.validPhoneNumber("321 746 8834"));
		assertFalse(ValidatePhoneNumber.validPhoneNumber("(185)-673-429"));
	}

}
