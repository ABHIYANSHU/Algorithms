package Java.Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class CircularLinkedList<E> implements IList<E> {
    
    private Node<E> Head;
    private int length;
    private E[] array;

    public CircularLinkedList()
    {
        Head = null;
        length = 0;
    }

    public void Add(E item)
    {
        Node<E> current = new Node<E>(item);

        if(Head == null){
            Head = current;
            Head.next = Head;
            return;
        }

        Node<E> start = Head;

        while(start.next!=Head){
            start = start.next;
        }

        start.next = current;
        current.next = Head;
    }

    public int Length()
    {
        int len = 0;

        Node<E> start = Head;

        if(start==null){
            return 0;
        }

        len++;
        while(start.next!=Head){
            len++;
            start = start.next;
        }

        length = len;
        return length;
    }

    public void Remove(E item)
    {
        Node<E> start = Head;

        if(start.getData().equals(item)){
            Node<E> current = Head;

            while(current.next!=Head){
                current = current.next;
            }

            Head = start.next;
            current.next = Head;
            return;
        }

        while(start.next!=Head){
            Node<E> prev = start;
            start = start.next;
            if(start.getData().equals(item)){
                prev.next = start.next;
                return;
            }
        }
    }

    public void RemoveAll()
    {
        Head = null;
        length = 0;
    }

    public boolean Exists(E item)
    {
        Node<E> start = Head;

        while(start.next!=Head)
        {
            if(start.getData().equals(item)){
                return true;
            }
            start = start.next;
        }

        return false;
    }

    public int IndexOf(E item)
    {
        int i = 0;
        Node<E> start = Head;

        while(start.next!=Head){
            if(start.getData().equals(item)){
                return i;
            }
            i++;
            start = start.next;
        }

        return -1;
    }

    public E ItemAt(int index)
    {
        int i = 0;

        Node<E> start = Head;

        do
        {
            if(i==index){
                return start.getData();
            }
            i++;
            start = start.next;
        }
        while(start!=Head);

        return null;
    }

    @SuppressWarnings("unchecked")
    public E[] ToArray()
    {
        E[] arrays = (E[])Array.newInstance(ItemAt(0).getClass(), Length());

        int i = 0;
        Node<E> start = Head;

        do
        {
            arrays[i] = start.getData();
            i++;
            start = start.next;
        }
        while(start!=Head);

        array = arrays;
        return array;
    }

    public Iterator<E> iterator()
    {
        if(array==null){
            return Arrays.stream(ToArray()).iterator();
        }

        return Arrays.stream(array).iterator();
    }

}