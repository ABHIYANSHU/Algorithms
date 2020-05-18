package Java.Lists;

public class DoublyCircularLinkedList<E> {
    
    private DoubleNode<E> Head;

    public DoublyCircularLinkedList()
    {
        Head = null;
    }

    public void Add(E item)
    {
        DoubleNode<E> current = new DoubleNode<E>(item);

        if(Head == null){
            Head = current;
            Head.next = Head;
            Head.previous = Head;
            return;
        }

        current.next = Head;
        current.previous = Head.previous;
        Head.previous = current;

    }
}