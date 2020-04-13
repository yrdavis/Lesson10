package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * This program checks North American phone numbers to see if they are valid.
 * 
 */

public class ValidatePhoneNumber {

	// Check phone number input for valid North American phone numbers.

	// Regular expression to capture valid phone numbers including (), - and .
	static String validInput = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

	public static boolean validPhoneNumber(String phoneNumber) {
		return phoneNumber.matches(validInput);
	}

}
