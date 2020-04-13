package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * This program encrypts and decrypt words/phrases 
 */
public class Encryptor {

	// method to encrypt a string
	public static String encrypt(String encryptMe) {
		// StringBuilder object to store the encrypted string
		StringBuilder builder = new StringBuilder();
		// convert each value of the string to its' ASCII numerical value
		for (int i = 0; i < encryptMe.length(); i++) {
			// store the numerical value of each character in the string
			int numericalValue = encryptMe.charAt(i);
			// increment the number of positions by 2 to encrypt the character
			numericalValue += 2;
			// append the resulting values to the builder object
			builder.append((char) numericalValue);
		}
		// return the string representation of the builder object
		return builder.toString();

	}

	// method to decrypt a string
	public static String decrypt(String decryptMe) {
		// StringBuilder object to store the decrypted string
		StringBuilder builder = new StringBuilder();
		// convert each value of the string to its' ASCII numerical value
		for (int i = 0; i < decryptMe.length(); i++) {
			// store the numerical value of each character in the string
			int numericalValue = decryptMe.charAt(i);
			// decrement the number of positions by 2 to encrypt the character
			numericalValue -= 2;
			// append the resulting values to the builder object
			builder.append((char) numericalValue);
		}
		// return the string representation of the builder object
		return builder.toString();

	}

}
