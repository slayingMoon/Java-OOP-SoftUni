package Inheritance_Lab.StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;
    private int lastIndex;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        this.lastIndex = this.data.size() - 1;
        return this.data.remove(this.lastIndex);
    }

    public String peek() {
        this.lastIndex = this.data.size() - 1;
        return this.data.get(this.lastIndex);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
