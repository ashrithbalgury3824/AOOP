package lab2a;

public class SimpleItemFactory extends ItemFactory {
    @Override
    public Item createWeapon() {
        return new Attack();
    }

    @Override
    public Item createPowerUp() {
        return new Healing();
    }
}