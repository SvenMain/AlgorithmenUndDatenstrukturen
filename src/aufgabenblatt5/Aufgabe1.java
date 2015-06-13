package aufgabenblatt5;

import java.util.*;

/**
 * Created by Sven on 07.06.2015.
 */
public class Aufgabe1 {
    /*
       Aufgabe 1
      Collection API - https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

      List - https://docs.oracle.com/javase/8/docs/api/java/util/List.html
       Das List-Interface schreibt das allgemeine Verhalten für Listen vor. Es ermöglicht das Index-basierte
       hinzufügen, auslesen, löschen oder ersetzen von Elementen und bietet außerdem noch Methoden zum erstellen von
       Sub-Listen und vielem mehr. Das List-Interface verbietet grundsätzlich nicht doppelte Objekte oder null-Objekte.

      Set - https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
        Ein Set ist eine Sammlung von Elementen, in der jedes Element nur einmal vorkommen darf. (vgl. Mengen Mathe)
        Da jedes Element nur einmal vorkommt wird kein Index benötigt.
        Bekannte Beispiele für die Implementierung des Interfaces sind HashSets oder auch EnmumSets.

      Queue - https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
        Eine Queue ist wieder der Name schon sagt eine (Warte)Schlange. (First in First out-Prinzip)
        Die Queue hat die besondere Eigenschaft, dass es einige Methoden "doppelt" gibt, wobei die eine Art Exceptions
        werfen kann und die andere "nur" einen entsprechenden Wert, wie zum Beispiel false oder null, zurück gibt.
        Beispiel: add() aus Collection wirft Exception im Fehlerfall||offer() aus Queue gibt false zurück im Fehlerfall
    */

    public enum Color {
        BLACK, WHITE, GREEN
    }

    public static void list() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Max");
        list1.add(1, "Mustermann");
        list1.add("Tina");
        list1.add("Musterfrau");
        System.out.println("Anzahl der Elemente in 'list1' : " + list1.size());
        list2.add("Tina");
        list2.add("Musterfrau");
        System.out.println("'list1' enthält alle Elemente aus 'list2' : " + list1.containsAll(list2));
        list1.set(3, "Mustermann");

        System.out.println("\n'list1' nach Änderung : ");
        for (String str : list1) {
            System.out.print(str + " ");
        }

    }

    public static void set() {
        Set<Color> set1 = new HashSet<>();
        Set<Color> set2 = new HashSet<>();
        set1.add(Color.BLACK);
        set1.add(Color.WHITE);
        set2.add(Color.BLACK);
        set2.add(Color.GREEN);
        set2.add(Color.WHITE);
        System.out.println("Farbe BLACK kann zum 2. mal hinzugefügt werden : " + set1.add(Color.BLACK));
        System.out.println("Farbe WHITE ist in 'set1' enthalten : " + set1.contains(Color.WHITE));
        System.out.println("'set1' enthölt alle Elemente aus 'set2' : " + set1.containsAll(set2));
        System.out.println("'set2' enthölt alle Elemente aus 'set1' : " + set2.containsAll(set1));
        set1.remove(Color.WHITE); //ist möglich, da jedes Objekt nur einmal vorhanden
    }

    public static void queue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("RechnungA");
        queue.offer("RechnungB");
        queue.offer("RechnungC");
        System.out.println("Als nächstes zu bezahlende Rechnung: " + queue.peek());

        queue.poll();//erstes Element aus Queue wird entfernt
        System.out.println("Als nächstes zu bezahlende Rechnung: " + queue.peek());
        queue.offer("RechnungD");

        System.out.println("\nAlle noch zu bezahlenden Rechnungen: ");
        while (!(queue.isEmpty())) {
            System.out.println(queue.poll());
        }
    }
}
