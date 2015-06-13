package aufgabenblatt5;

import java.util.Iterator;

/**
 * Created by Sven on 07.06.2015.
 */
public class Aufgabe4 {

    public static void staticSizeListSum() {
        Integer sum = 0;
        StaticSizeList<Integer> list = new StaticSizeList<>(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Iterator<Integer> listIterator = list.iterator();

        while (listIterator.hasNext()) {
            sum += listIterator.next();
        }
        System.out.println("Die Summe beträgt : " + sum);
    }

    public static void myLinkedListSum() {
        Integer sum = 0;
        MyLinkedList<Integer> list = new MyLinkedList<>(4);
        list = list.add(5);
        list = list.add(6);
        list = list.add(7);

        Iterator<Integer> listIterator = list.iterator();

        while (listIterator.hasNext()) {
            sum += listIterator.next();
        }
        System.out.println("Die Summe beträgt : " + sum);
    }

}
