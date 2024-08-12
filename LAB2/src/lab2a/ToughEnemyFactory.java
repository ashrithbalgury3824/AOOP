package lab2a;

public class ToughEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new ToughEnemy();
    }
}