package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * This program that creates a hangman word puzzle to be solved.
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import examples.FileHelper;

public class Hangman extends KeyAdapter {

	// List array to store words
	static List<String> words = new ArrayList<String>();

	private static String puzzle, puzzles;

	ArrayList<JLabel> boxes = new ArrayList<JLabel>();

	// Number of guesses allowed to win
	int lives = 9;

	JLabel livesLabel = new JLabel("" + lives);
	// count number of correct answers
	int numberOfCorrectGuesses;
	// Are you a winner
	boolean winner;
	// Generate a random word
	static Random random = new Random();

	public static void main(String[] args) {
		// load word file in words array
		words = loadWords();

		Hangman hangman = new Hangman();
		hangman.addPuzzles();
		hangman.createUI();
	}

	// load array with words from a file
	public static List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");

	}

	// Create the puzzle
	private void addPuzzles() {
		// Randomly pick a word from the words array
		puzzles = words.get(random.nextInt(words.size()));
		// The puzzle is the randomly picked word in lower case
		puzzle = puzzles.toLowerCase();
	}

	JPanel panel = new JPanel();

	private void createUI() {
		// playDeathKnell();
		addPuzzles();
		JFrame frame = new JFrame("June's Hangman");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(livesLabel);
		loadNextPuzzle();
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	private void loadNextPuzzle() {
		removeBoxes();
		winner = false;
		numberOfCorrectGuesses = 0;
		lives = 9;
		livesLabel.setText("" + lives);
		addPuzzles();
		System.out.println("puzzle is now " + puzzle);
		createBoxes();
	}

	public void keyTyped(KeyEvent arg0) {
		System.out.println(arg0.getKeyChar());
		try {
			updateBoxesWithUserInput(arg0.getKeyChar());
		} catch (InvalidCharacterException e) {
			// Is the entered character a lower case letter
			if (!Character.isLowerCase(arg0.getKeyChar())) {
				// System.out.println("Please enter a lowercase letter!");
				JOptionPane.showMessageDialog(null, "Please enter a lowercase letter.");
			}

		}
		// System.out.println(" Checking for winner " + winner);
		if (winner == true) {
			JOptionPane.showMessageDialog(null, "Great, you have won the hangman game.");
			// System.out.println();
			loadNextPuzzle();
		}
		if (lives == 0) {
			JOptionPane.showMessageDialog(null, "Sorry, you have lost the hangman game.");
			// playDeathKnell();
			loadNextPuzzle();
		}

	}

	// Method to check character input to see if letter is in the puzzle word
	private void updateBoxesWithUserInput(char keyChar) throws InvalidCharacterException {
		// check if special character throws invalidCharacterException
		boolean gotOne = false;

		for (int i = 0; i < puzzle.length(); i++) {
			if (puzzle.charAt(i) == keyChar) {
				boxes.get(i).setText("" + keyChar);
				gotOne = true;
				numberOfCorrectGuesses++;
			}
		}
		// System.out.println(" puzzle.length " + puzzle.length() + " and no correct
		// guesses " + numberOfCorrectGuesses);
		if (puzzle.length() == numberOfCorrectGuesses) {
			winner = true;
		}

		if (!gotOne)
			livesLabel.setText("" + --lives);
	}

	void createBoxes() {
		for (int i = 0; i < puzzle.length(); i++) {
			JLabel textField = new JLabel("_");
			boxes.add(textField);
			panel.add(textField);
		}
	}

	void removeBoxes() {
		for (JLabel box : boxes) {
			panel.remove(box);
		}
		// boxes.clear();

	}

	public void playDeathKnell() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("resource/funeral-march.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(8400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
