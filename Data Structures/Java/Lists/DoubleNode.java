package Java.Lists;

public class DoubleNode<E> {
    
    public DoubleNode<E> previous;
    public DoubleNode<E> next;
    private E data;

    public DoubleNode(E data){
        this.data = data;
        previous = null;
        next = null;
    }

    public E getData(){
        return data;
    }
}