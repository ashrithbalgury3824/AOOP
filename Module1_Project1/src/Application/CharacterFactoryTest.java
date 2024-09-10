package Application;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CharacterFactoryTest {

    @Test
    public void testWarriorCreation() {
        CharacterFactory factory = new WarriorFactory();
        Character warrior = factory.createCharacter("Gorthok", 100, 20);

        assertEquals("Gorthok", warrior.getName());
        assertEquals(100, warrior.getHealth());
        assertEquals(20, warrior.getDamage());
    }
}
