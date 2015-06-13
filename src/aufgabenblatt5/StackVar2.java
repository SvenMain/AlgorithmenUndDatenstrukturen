package aufgabenblatt5;

/**
 * Created by Sven on 13.06.2015.
 */
public class StackVar2<E> extends MySequentialLinkedList<E> {
    public E pop(){
        E lastObject = this.get(this.size()-1);
        this.remove(lastObject);
        return lastObject;
    }

    public E push(E item){
        E newObject = this.set(this.size(), item);
        return item;
    }
}
