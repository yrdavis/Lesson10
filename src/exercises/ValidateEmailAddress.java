package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * This program checks email addresses to see if they are valid by RFC 5322 standards.
 * 
 */
public class ValidateEmailAddress {

	// Check email address is valid as permitted by RFC 5322.

	// Regular expression to capture valid email address.
	static String validInput = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?!-)(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	public static boolean validEmailAddress(String emailAddress) {
		return emailAddress.matches(validInput);
	}

}
