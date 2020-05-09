using System;
using System.Collections;
namespace Lists
{
    public class Node<E>
    {
        public Node<E> next { get; set; }
        public E data { get; }

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
}