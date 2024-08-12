package lab2a;

public class GameState {
    private static GameState instance;
    private int currentLevel;
    private String currentDifficulty;

    private GameState() {
    	
    }

    public static  GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
            instance.currentLevel = 1;
            instance.currentDifficulty = "easy";
        }
        return instance;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int level) {
        this.currentLevel = level;
    }

    public String getCurrentDifficulty() {
        return currentDifficulty;
    }

    public void setCurrentDifficulty(String difficulty) {
        this.currentDifficulty = difficulty;
    }
}