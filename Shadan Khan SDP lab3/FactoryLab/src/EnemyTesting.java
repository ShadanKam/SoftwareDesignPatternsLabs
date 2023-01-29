import java.util.Scanner;

public class EnemyTesting {

	public static void main(String[] args) {

		// Create ship
		EnemyShipFactory shipFactory = new EnemyShipFactory();

		// Enemy ship object
		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("What type of ship? (Ufo , Rocket , BigUfo)");
		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();

			theEnemy = shipFactory.getShip(typeOfShip);

			if (theEnemy != null) {

				doStuffEnemy(theEnemy);

			} else
				System.out.print("Please enter U, R, or B next time");

		}
		userInput.close();
	}

	// Executes methods of the super class

	public static void doStuffEnemy(EnemyShip anEnemyShip) {

		anEnemyShip.displayEnemyShip();

		anEnemyShip.followHeroShip();

		anEnemyShip.enemyShipShoots();

	}

}
