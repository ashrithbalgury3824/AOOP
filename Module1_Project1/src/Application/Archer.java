package Application;

public class Archer extends Character {
    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " the Archer shoots an arrow!");
    }
}