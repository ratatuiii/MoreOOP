package lotr;
import java.lang.reflect.Constructor;
import java.util.Random;

public class CharacterFactory {
    private static final Class<? extends Character>[] CHARACTER_CLASSES = new Class[] {
        Hobbit.class, Elf.class, King.class, Knight.class
    };

    public Character createCharacter() {
        try {
            int randomIndex = new Random().nextInt(CHARACTER_CLASSES.length);
            Constructor<? extends Character> constructor = CHARACTER_CLASSES[randomIndex].getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create character", e);
        }
    }
}