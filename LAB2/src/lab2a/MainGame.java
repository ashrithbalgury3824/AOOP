package lab2a;

public class MainGame {

	public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        gameState.setCurrentLevel(1);
        gameState.setCurrentDifficulty("easy");

        EnemyFactory enemyFactory = EnemyFactoryProvider.getFactory(gameState.getCurrentDifficulty());
        Enemy enemy = enemyFactory.createEnemy();
        enemy.performAttack();

        ItemFactory itemFactory = ItemFactoryProvider.getFactory(gameState.getCurrentDifficulty());
        Item weapon = itemFactory.createWeapon();
        Item powerUp = itemFactory.createPowerUp();
        weapon.useItem();
        powerUp.useItem();
	}

}
