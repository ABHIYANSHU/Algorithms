using System;
using System.Collections.Generic;
using System.Text;

namespace Lists
{
    public class DoubleNode<E>
    {
        public DoubleNode<E> previous { get; set; }
        public DoubleNode<E> next { get; set; }
        public E data { get; }
        public DoubleNode(E data)
        {
            this.data = data;
            previous = null;
            next = null;
        }
    }
}
