package gcf;

public class WarriorFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int health, int damage) {
        return new Warrior(name, health, damage);
    }
}