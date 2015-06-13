package aufgabenblatt5;

import java.util.*;


/**
 * Created by Sven on 07.06.2015.
 */
public class MySequentialLinkedList<E> extends AbstractSequentialList<E> implements Iterable<E> {

    private class Node {
        E value;
        Node prev;
        Node next;

        Node(E value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node first = null;
    private Node last = null;
    private int count = 0;

    public MySequentialLinkedList() {
    }

    public MySequentialLinkedList(Collection<E> c) {
        for (E e : c) {
            if (count == 0) {
                first = new Node(e, null, null);
                last = first;
            } else {
                last.next = new Node(e, last, null);
                last = last.next;
            }
            count++;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        for (E e : this) {
            builder.append(((first) ? "[" : ", ") + e.toString());
            first = false;
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new ListIterator<E>() {
            int indexCursorNext = 0;
            Node cursorNext = first;
            Node cursorPrev = null;
            Node lastNode = null;

            {
                if (index > count || index < 0) {
                    throw new IndexOutOfBoundsException();
                }
                int pos = 0;
                while (pos < index) {
                    pos++;
                    next();
                }
            }

            @Override
            public boolean hasNext() {
                return cursorNext != null;
            }

            @Override
            public E next() {
                if (cursorNext == null) {
                    throw new NoSuchElementException();
                }
                lastNode = cursorNext;
                cursorPrev = cursorNext;
                cursorNext = cursorNext.next;
                indexCursorNext++;
                return lastNode.value;
            }

            @Override
            public boolean hasPrevious() {
                return cursorPrev != null;
            }

            @Override
            public E previous() {
                if (cursorPrev == null) {
                    throw new NoSuchElementException();
                }
                lastNode = cursorPrev;
                cursorNext = cursorPrev;
                cursorPrev = cursorPrev.prev;
                indexCursorNext--;
                return lastNode.value;
            }

            @Override
            public int nextIndex() {
                return indexCursorNext;
            }

            @Override
            public int previousIndex() {
                return indexCursorNext - 1;
            }

            @Override
            public void remove() {
                if (lastNode == null) {
                    throw new IllegalStateException();
                }
                if (lastNode.prev != null) {
                    lastNode.prev.next = lastNode.next;
                }
                if (lastNode.next != null) {
                    lastNode.next.prev = lastNode.prev;
                }
                if (lastNode == last) {
                    last = last.prev;
                }
                if (lastNode == first) {
                    first = first.next;
                }
                lastNode = null;
                count--;
            }

            @Override
            public void set(E e) {
                if (lastNode == null) {
                    throw new IllegalStateException();
                } else
                    lastNode.value = e;
            }

            @Override
            public void add(E e) {
                lastNode = null;
                if (cursorPrev == null) {
                    first = new Node(e, null, first);
                    if (last == null) {
                        last = first;
                    }
                    cursorPrev = first;
                } else if (!hasNext()) {
                    Node newLast = new Node(e, last, null);
                    last.next = newLast;
                    last = newLast;
                    cursorPrev = cursorPrev.next;
                } else {
                    Node newNode = new Node(e, cursorPrev, cursorNext);
                    cursorPrev.next = newNode;
                    cursorNext.prev = newNode;
                    cursorPrev = newNode;
                }
                count++;
            }
        };
    }


}
