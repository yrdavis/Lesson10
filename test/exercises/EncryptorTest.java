package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * This program tests the methods of Encryptor to check for valid processing
 * 
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncryptorTest {

	@Test
	void testEncryptOneCharacter() {
		assertEquals("c", Encryptor.encrypt("a"));
	}

	@Test
	void testEncryptWord() throws Exception {
		assertEquals("ccc", Encryptor.encrypt("aaa"));
		assertEquals("Lcxc", Encryptor.encrypt("Java"));
	}

	// Exercise: decrypt this sentence: Nkxg"nqpi"cpf"rtqurgt#
	@Test
	void testDecryptWord() {
		assertEquals("Live long and prosper!", Encryptor.decrypt("Nkxg\"nqpi\"cpf\"rtqurgt#"));
	}

}
