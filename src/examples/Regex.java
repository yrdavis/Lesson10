package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
		// Pattern
		Pattern pattern = Pattern.compile("^j.*\\d$");
		
		// Matcher
		Matcher matcher = pattern.matcher("joonspoon1");
		
		System.out.println(matcher.find());
		
		// Regex reference guide: https://cs.lmu.edu/~ray/notes/regex/
		
		// Exercise: validate email addresses and phone numbers
	}

}
