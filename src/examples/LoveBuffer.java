package examples;

public class LoveBuffer {
	public static void main(String[] args) {
		
		// StringBuffer & StringBuilder
		
		// 1. initialize
		StringBuffer buffer = new StringBuffer();
		
		// 2. append stuff 
		for (int i = 0; i < 30; i++) {
			buffer.append("x");
			buffer.append("o");
		}
		
		// 3. convert to String
		System.out.println(buffer.toString());

	}
}
