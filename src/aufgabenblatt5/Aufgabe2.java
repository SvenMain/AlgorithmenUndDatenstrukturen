package aufgabenblatt5;

import java.util.Iterator;

/**
 * Created by Sven on 07.06.2015.
 */
public class Aufgabe2 {
    /*
       Aufgabe2
      Iterable API - https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
       1.Mit diesem Interface wird eine erweiterte for-Schleife implementiert. Sie l�uft nicht nur Felder ab, sondern
       alles, was vom Typ Iterable ist.
       Beispielsweise kann man bei richtiger Implementierung des Interface einen Satz, welcher in einem String
       gespeichert wird, in die einzelnen W�rter zerteilen, ohne daf�r ein String-Array oder �hnliches zu benutzen.
       Dabei gibt die iterator()-Methode immer das gesamt Objekt zur�ck welches bearbeitet wird.

      Iterator API - https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
       2.Dieses Interface dient zur Definition der iterierbaren Objekte, welche aus dem Objekt der Methode iterator() entstehen...
       Die Methode hastNext() gibt einen boolean zur�ck, welcher angibt ob auf das momentane Objekt noch ein Objekt folgt.
       E next() liefert das folgende Objekt, wenn eins existiert. Ansonsten NoSuchElementException.
       remove() entfernt das letzte Objekt, welches die for-Schleife abarbeiten w�rde.

      remove() API - https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html#remove--
       3. Die Methode void remove() ist optional.

       default void remove() {
        throw new UnsupportedOperationException("remove");
       }
     */
}
