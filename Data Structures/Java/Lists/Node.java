package Java.Lists;

public class Node<E> {
    
    public Node<E> next;
    private E data;

    public Node(E data){
        this.data = data;
        this.next = null;
    }

    public E getData(){
        return data;
    }
}