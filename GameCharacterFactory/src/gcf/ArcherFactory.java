package gcf;

public class ArcherFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int health, int damage) {
        return new Archer(name, health, damage);
    }
}