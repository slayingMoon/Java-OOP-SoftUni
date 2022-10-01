package Inheritance_Lab.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E>{
    private Random rnd;

    public Object getRandomElement() {
        rnd = new Random();
        int end = super.size();
        int randIndex = rnd.nextInt(end);
        return remove(randIndex);
//        int index = this.rnd.nextInt(super.size());
//        Object element = super.get(index);
//        super.remove(index);
//        return element;
    }
}
