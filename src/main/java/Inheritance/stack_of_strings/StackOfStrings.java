package Inheritance.stack_of_strings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;
    private int index = -1;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String element) {
        this.data.add(element);
        this.index ++;
    }

    public String peek() {
        return this.data.get(this.index);
    }

    public String pop() {

        return this.data.remove(this.index--);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
