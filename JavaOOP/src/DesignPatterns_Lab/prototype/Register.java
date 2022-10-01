package DesignPatterns_Lab.prototype;

import java.util.HashMap;
import java.util.Map;

public class Register {

    private Map<String, Item> registry;

    public Register() {
        registry = new HashMap<>();
        loadTypes();
    }

    private void loadTypes() {
        Book book = new Book("Lord of the rings", "lotr//img", 29.99);
        book.setAuthor("J. R. R. Tolkien");
        registry.put("Book", book);

        Music music = new Music("Slayer", "slayer//img", 15.99);
        music.setDuration(4.32);
        registry.put("Music", music);
    }

    public Item getItem(String type) {
        try {
            return registry.get(type).clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }


}
