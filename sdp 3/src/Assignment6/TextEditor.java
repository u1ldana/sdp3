package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<CharacterLocation> characters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory factory) {
        this.characterFactory = factory;
    }


    public void insertText(String text, String font, int size, int startX, int startY) {
        int x = startX;
        int y = startY;

        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c, font, size);
            characters.add(new CharacterLocation(character, x, y));
            x += 10;
        }
    }


    public void renderText() {
        for (CharacterLocation cl : characters) {
            cl.character.render(cl.x, cl.y);
        }
    }


    private static class CharacterLocation {
        Character character;
        int x, y;

        public CharacterLocation(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }
    }
}

