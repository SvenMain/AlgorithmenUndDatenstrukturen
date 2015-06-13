package aufgabenblatt5;

import java.util.*;
import java.util.List;


/**
 * Created by Sven on 07.06.2015.
 */
public class MyLinkedList<E> implements Iterable<E> {

    private E element;
    private MyLinkedList<E> rest;

    public MyLinkedList(E element) {
        this.element = element;
    }

    public MyLinkedList(E element, MyLinkedList<E> rest) {
        this.element = element;
        this.rest = rest;
    }

    public MyLinkedList(MyLinkedList<E> rest, E element) {
        this.element = element;
        this.rest = rest;
    }

    public MyLinkedList<Integer> add(E value) {
        return new MyLinkedList(this, value);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private MyLinkedList<E> current = new MyLinkedList(element, rest);

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (current == null)
                    throw new NoSuchElementException();
                E val = current.element;
                current = current.rest;
                return val;
            }
        };
    }
}
