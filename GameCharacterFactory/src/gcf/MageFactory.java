package gcf;

public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int health, int damage) {
        return new Mage(name, health, damage);
    }
}
