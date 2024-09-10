package Application;

public class Mage extends Character {
    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " the Mage casts a fireball!");
    }
}