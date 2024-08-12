package lab2a;

public class EnemyFactoryProvider {
    public static EnemyFactory getFactory(String difficulty) {
        if (difficulty.equals("easy")) {
            return new EasyEnemyFactory();
        } else if (difficulty.equals("hard")) {
            return new ToughEnemyFactory();
        } else {
            throw new IllegalArgumentException("Invalid difficulty level");
        }
    }
}