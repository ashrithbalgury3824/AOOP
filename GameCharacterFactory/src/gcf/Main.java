package gcf;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new WarriorFactory();
        Character warrior = factory.createCharacter("Gorthok", 100, 20);

        factory = new MageFactory();
        Character mage = factory.createCharacter("Eryndor", 80, 30);

        factory = new ArcherFactory();
        Character archer = factory.createCharacter("Legolas", 90, 25);

        System.out.println("Warrior:");
        System.out.println("Name: " + warrior.getName());
        System.out.println("Health: " + warrior.getHealth());
        System.out.println("Damage: " + warrior.getDamage());
        warrior.attack();
        System.out.println();

        System.out.println("Mage:");
        System.out.println("Name: " + mage.getName());
        System.out.println("Health: " + mage.getHealth());
        System.out.println("Damage: " + mage.getDamage());
        mage.attack();
        System.out.println();

        System.out.println("Archer:");
        System.out.println("Name: " + archer.getName());
        System.out.println("Health: " + archer.getHealth());
        System.out.println("Damage: " + archer.getDamage());
        archer.attack();
        System.out.println();
    }
}