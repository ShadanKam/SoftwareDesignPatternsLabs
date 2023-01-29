
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ScrabbleGame {

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", };

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
	private static ScrabbleGame letters = null;

	// Constructor
	private ScrabbleGame() {
	}

	// Method return a list of letters in the Game
	public LinkedList<String> getLetterList() {
		return this.letterList;
	}

	public static ScrabbleGame getLetters() {
		if (letters == null) {
			letters = new ScrabbleGame();
		}
		return letters;
	}

	// Method return a list of letters for each player equal to the send integer
	// value
	public LinkedList<String> getTiles(int howManyTiles) {

		// Tiles to be returned to the user
		LinkedList<String> tilesToSend = new LinkedList<String>();

		// Cycle through the LinkedList while adding the starting
		// Strings to the to be returned LinkedList while deleting
		// them from letterList

		for (int i = 0; i <= howManyTiles; i++) {

			tilesToSend.add(this.letterList.remove(0));

		}

		// Return the number of letter tiles requested

		return tilesToSend;

	}

	// Method return the size of the list
	public Integer getListSize() {
		Integer number = letterList.size();
		return number;
	}

}
