package aufgabenblatt5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sven on 07.06.2015.
 */
public class Aufgabe3 {
    public static List<Integer> iList = new ArrayList<>();
    public static void aufgabe3() {
        iList.add(1);
        iList.add(2);
        iList.add(3);
        iList.add(4);
        forEachSum();
        iteratorSum();
    }

    /*
     Die forEach Schleife geht jedes Element der Liste iList,
     welches vom Typ Integer ist, durch und führt die Operation
     'sum = sum + elem;' aus.
     */
    public static void forEachSum(){
        int sum = 0;
        for (Integer elem : iList) {
            sum += elem;
        }
        System.out.println("Berechnete Summe mit for-Each-Schleife : " + sum);
    }

    /*
     Vor Beginn der while Schleife wird ein Iterator deklariert, welcher sich auf iList bezieht.
     Im Kopf der while Schleife wird nun geprüft ob der Iterator ein nächstes Objekt hat und falls
     dies der Fall ist (Rückgabewert true) wird das nächste Objekt auf die Summe aufaddiert.(siehe oben)

     */
    public static void iteratorSum(){
        int sum = 0;
        Iterator<Integer> iter = iList.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.println("Berechnete Summe mit Iterator : " + sum);
    }
}
