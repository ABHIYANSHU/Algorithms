package Java.Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class DoublyLinkedList<E> implements IList<E> {
    
    private DoubleNode<E> Head;
    private DoubleNode<E> Tail;
    private E[] array;
    private int length;

    public DoublyLinkedList(){
        Head = null;
        Tail = null;
        length = 0;
    }

    public void Add(E item) {
        DoubleNode<E> current = new DoubleNode<E>(item);

        if(Head == null){
            Head = current;
            Tail = Head;
            return;
        }

        DoubleNode<E> start = Head;
        while(start.next!=null){
            start = start.next;
        }

        Tail = current;
        Tail.previous = start;
        start.next = Tail;
    }

    public int Length(){
        int len = 0;
        DoubleNode<E> start = Head;

        while(start!=null){
            len++;
            start = start.next;
        }

        length = len;
        return length;
    }

    public void Remove(E item){
        DoubleNode<E> start = Head;
        DoubleNode<E> prev = null;

        if(start!=null){
            if(start.getData().equals(item)){
                Head = start.next;
                Head.previous = null;
                return;
            }

            while(start!=null){
                prev = start;
                start = start.next;
                if(start.getData().equals(item)){
                    prev.next = start.next;
                    if(start.next==null){
                        start = start.previous;
                        Tail = start;
                    }
                    else{
                        start = start.previous;
                        start.next.previous = start;
                        while(start.next!=null){
                            start = start.next; 
                        }
                        Tail = start;
                    }
                    return;
                }
            }
            
        }
    }

    public void RemoveAll(){
        Head = null;
        Tail = null;
        length = 0;
    }

    @SuppressWarnings("unchecked")
    public E[] ToArray(){
        E[] arrays = (E[])Array.newInstance(ItemAt(0).getClass(), Length());

        int i = 0;
        DoubleNode<E> start = Head;

        while(start!=null){
            arrays[i] = start.getData();
            i++;
            start = start.next;
        }

        this.array = arrays;
        return array;
    }

    public Iterator<E> iterator(){
        if(array!=null){
            return Arrays.stream(array).iterator();
        }
        return Arrays.stream(ToArray()).iterator();
    }

    public E ItemAt(int index){
        int i;
        int len = Length();
        if(index>(len/2)){
            DoubleNode<E> end = Tail;
            i = len;
            while(end!=null){
                if(i==index){
                    return end.getData();
                }
                end = end.previous;
                i--;
            }
        }
        else{
            DoubleNode<E> start = Head;
            i = 0;
            while(start!=null){
                if(i==index){
                    return start.getData();
                }
                start = start.next;
                i++;
            }
        }
        return null;
    }

    public String toStraight(){
        String sen = "";

        DoubleNode<E> start = Head;
        while(start!=null){
            sen = sen + start.getData();
            start = start.next;
        }

        return sen;
    }

    public String toReverse(){
        String sen = "";

        DoubleNode<E> start = Tail;
        while(start!=null){
            sen = sen + start.getData();
            start = start.previous;
        }

        return sen;
    }

    public boolean Exists(E item){
        DoubleNode<E> start = Head;

        while(start!=null){
            if(start.getData().equals(item)){
                return true;
            }
            start = start.next;
        }

        return false;
    }

    public int IndexOf(E item){
        DoubleNode<E> start = Head;

        int i = 0;
        while(start!=null){
            if(start.getData().equals(item)){
                return i;
            }
            i++;
            start = start.next;
        }

        return -1;
    }

}