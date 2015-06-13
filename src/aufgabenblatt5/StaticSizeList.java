package aufgabenblatt5;


import java.util.*;


/**
 * Created by Sven on 07.06.2015.
 */
public class StaticSizeList<E> implements Iterable<E> {
    private E[] array;
    private int index = 0;

    public StaticSizeList(int size) {
        array = (E[]) new Object[size];
    }

    public void add(E value) {
        if (index < array.length) {
            array[index] = value;
            index++;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return Arrays.asList(array).iterator();
    }
}
