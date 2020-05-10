package Java.Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class LinkedList<E> implements IList<E> {

    private int length;
    private Node<E> Head;
    private E[] array;

    public LinkedList(){
        Head = null;
        length = 0;
    }

    public int Length(){
        int len = 0;

        Node<E> current = Head;
        while(current != null){
            current = current.next;
            len++;
        }

        length = len;
        return length;
    }

    public void Add(final E item) {
        final Node<E> current = new Node<E>(item);

        if (Head == null) {
            Head = current;
            return;
        }

        Node<E> lastNode = Head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = current;
    }

    public void Remove(final E item) {
        Node<E> current = Head;
        Node<E> prev = null;

        if (current != null) {
            if (current.getData().equals(item)) {
                Head = current.next;
                return;
            }

            while (current != null) {
                prev = current;
                current = current.next;
                if (current.getData().equals(item)) {
                    prev.next = current.next;
                    return;
                }
            }
        }
    }

    public void RemoveAll() {
        Head = null;
        length = 0;
    }

    @SuppressWarnings("unchecked")
    public E[] ToArray() {
        E[] arrays = (E[])Array.newInstance(ItemAt(0).getClass(), length); 
        int i = 0;

        Node<E> current = Head;
        while (current != null)
        {
            arrays[i] = current.getData();
            current = current.next;
            i++;
        }

        this.array = arrays;
        return array;
    }

    public boolean Exists(E item){
        Node<E> current = Head;

        while (current != null){
            if (current.getData().equals(item)){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public Iterator<E> iterator(){
        return Arrays.stream(array).iterator();
    }

    public int IndexOf(E item){
        int i = 0;
        Node<E> current = Head;

        while(current != null){
            if (current.getData().equals(item)){
                return i;
            }
            i++;
            current = current.next;
        }

        return -1;
    }

    public E ItemAt(int index)
    {
        int i = 0;
        Node<E> current = Head;

        if(index > length)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        while(current != null && i < index)
        {
            current = current.next;
            i++;
        }

        if(current == null)
        {
            throw new NullPointerException("Item not Found");
        }

        return current.getData();            
    }

}