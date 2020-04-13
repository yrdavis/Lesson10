package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * This program looks for words in a defined dictionary to see if they are palindromes.
 * 
 */
import java.util.ArrayList;
import java.util.List;

import examples.FileHelper;

public class Palindrome {

	List<String> words = new ArrayList<String>();

	void Dictionary() {
		words = loadWords();
	}

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}

	public boolean wordExists(String word) {
		return words.contains(word);
	}

	public boolean isAPalindrome(String word) {
		// String a = "";
		StringBuilder word2 = new StringBuilder(word);
//		word2.reverse();
//		int length = word.length();
//		for (int i = length - 1; i > 0; i--) {
//			word2 = word2 + word.charAt(i);
		if (word2.reverse().toString() == (word)) {
			// return true;
			System.out.println("The string " + word + " is a palindrome");
		}

		return true;
	}

}
