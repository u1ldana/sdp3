package Assignment6;

public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        TextEditor editor = new TextEditor(factory);


        editor.insertText("Hello", "Uldana", 12, 0, 0);
        editor.insertText("World", "Uldana", 12, 0, 20);
        editor.renderText();
    }
}

