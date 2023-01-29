public class EnemyShipFactory {
    public EnemyShip getShip(String shipType) {
        if (shipType == null) {
            return null;
        }

        if (shipType.equalsIgnoreCase("ROCKET")) {
            return new RocketEnemyShip();
        } else if (shipType.equalsIgnoreCase("UFO")) {
            return new UFOEnemyShip();
        } else if (shipType.equalsIgnoreCase("BIGUFO")) {
            return new BigUFOEnemyShip();
        }

        return null;
    }

    public void followHeroShip() {
    }

    public void displayEnemyShip() {
    }

    public void enemyShipShoots() {
    }

}
