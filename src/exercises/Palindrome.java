package exercises;

import java.util.List;

import org.curiousworks.lesson9.FileHelper;

public class Palindrome {

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}
}
