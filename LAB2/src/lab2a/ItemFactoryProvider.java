package lab2a;

public class ItemFactoryProvider {
    public static ItemFactory getFactory(String difficulty) {
        if (difficulty.equals("easy")) {
            return new SimpleItemFactory();
        } else if (difficulty.equals("hard")) {
            return new AdvancedItemFactory();
        } else {
            throw new IllegalArgumentException("Invalid difficulty level");
        }
    }
}