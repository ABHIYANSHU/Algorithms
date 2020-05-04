using System.Collections;
using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;

namespace Lists
{
    public class LinkedList<E> : IList<E>, IEnumerable
    {
        private int length;
        private Node<E> Head;
        private E[] array;

        public LinkedList(){
            Head = null;
            length = 0;
        }

        public int Length(){
            Node<E> current = Head;
            while (current != null)
            {
                current = current.next;
                length++;
            }
            return length;
        }

        public void Add(E item){
            Node<E> current = new Node<E>(item);

            if (Head == null)
            {
                Head = current;
                return;
            }

            Node<E> lastNode = Head;
            while (lastNode.next != null)
            {
                lastNode = lastNode.next;
            }

            lastNode.next = current;
        }

        public void Remove(E item)
        {
            Node<E> current = Head;
            Node<E> prev = null;

            if(current != null)
            {
                if (current.data.Equals(item))
                {
                    Head = current.next;
                    return;
                }

                while(current!=null)
                {
                    prev = current;
                    current = current.next;
                    if (current.data.Equals(item))
                    {
                        prev.next = current.next;
                        return;
                    }
                }
            }
        }

        public void RemoveAll()
        {
            Head = null;
            length = 0;
        }
        
        public E[] ToArray()
        {
            E[] array = new E[length];
            int i = 0;

            Node<E> current = Head;
            while (current != null)
            {
                array[i] = current.data;
                current = current.next;
                i++;
            }

            this.array = array;
            return array;
        }

        public bool Exists(E item)
        {
            if(this.array == null)
            {
                ToArray();
            }
            foreach(E val in this.array)
            {
                if (item.Equals(val))
                    return true;
            }
            return false;
        }

        public IEnumerator GetEnumerator(){
            if (this.array == null)
            {
                ToArray();
            }
            return this.array.GetEnumerator();
        }

        public int IndexOf(E item)
        {
            int i = 0;
            if(this.array == null)
            {
                ToArray();
            }
            foreach(E val in this.array)
            {
                if (val.Equals(item))
                {
                    return i;
                }
                i++;
            }
            return -1;
        }

        public E ItemAt(int index)
        {
            if(this.array == null)
            {
                ToArray();
            }
            return array[index];
        }
    }
}