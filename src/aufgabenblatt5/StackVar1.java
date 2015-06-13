package aufgabenblatt5;

/**
 * Created by Sven on 13.06.2015.
 */
public class StackVar1<E> {
    private MySequentialLinkedList<E> mySequentialLinkedList;

    public E pop(){
        E lastObject = mySequentialLinkedList.get(mySequentialLinkedList.size()-1);
        mySequentialLinkedList.remove(lastObject);
        return lastObject;
    }

    public E push(E item){
        E newObject = mySequentialLinkedList.set(mySequentialLinkedList.size(), item);
        return item;
    }

}
