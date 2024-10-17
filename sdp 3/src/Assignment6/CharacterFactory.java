package Assignment6;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characterMap = new HashMap<>();


    public Character getCharacter(char value, String font, int size) {
        String key = value + font + size;
        Character character = characterMap.get(key);

        if (character == null) {
            character = new Character(value, font, size);
            characterMap.put(key, character);
            System.out.println("Created new Character: " + value + ", font: " + font + ", size: " + size);
        } else {
            System.out.println("Reused existing Character: " + value + ", font: " + font + ", size: " + size);
        }
        return character;
    }
}
