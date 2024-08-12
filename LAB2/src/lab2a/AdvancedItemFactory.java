package lab2a;

public class AdvancedItemFactory extends ItemFactory {
    @Override
    public Item createWeapon() {
        return new MagicPower();
    }

    @Override
    public Item createPowerUp() {
        return new Healing();
    }
}