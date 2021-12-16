package Inheritance.random_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement() {
        int end = super.size();
        Random rand = new Random();
        int nextIndex = rand.nextInt(end);
        return remove(nextIndex);
    }
}
