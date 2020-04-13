package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * This program checks the method that validates email addresses 
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateEmailAddressTest {

	@Test
	public void testEmailAddress() {
		assertTrue(ValidateEmailAddress.validEmailAddress("user.name@domain.com"));
		assertFalse(ValidateEmailAddress.validEmailAddress(".user@domain.com"));
		assertFalse(ValidateEmailAddress.validEmailAddress("user@domain..com"));
		assertFalse(ValidateEmailAddress.validEmailAddress("user@-domain.com"));
	}

}
