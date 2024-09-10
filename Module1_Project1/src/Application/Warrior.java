package Application;

public class Warrior extends Character {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " the Warrior attacks with a sword!");
    }
}