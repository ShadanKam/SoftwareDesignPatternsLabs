import java.util.LinkedList;

public class Play {

	public static void main(String[] args) {

		// create object of scrabble class
		ScrabbleGame scrabble = ScrabbleGame.getLetters();

		// create instance variable
		LinkedList<String> playerTiles;

		// print letter list at the begening of the game
		System.out.println(scrabble.getLetterList());

		// Get the size of the letters list
		System.out.println("List size: " + scrabble.getListSize());

		// player request Tiles of 7
		playerTiles = scrabble.getTiles(7);
		// print player Tiles
		System.out.println(playerTiles);

		System.out.println();

		// create object of scrabble class
		ScrabbleGame scrabble2 = ScrabbleGame.getLetters();

		// create instance variable
		LinkedList<String> playerTiles2;

		// print letter list at the begening of the game
		System.out.println(scrabble2.getLetterList());

		// Get the size of the letters list
		System.out.println("List size: " + scrabble2.getListSize());

		// player request Tiles of 7
		playerTiles2 = scrabble2.getTiles(7);
		// print player Tiles
		System.out.println(playerTiles2);
	}

}
