using System.Collections;
using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;

namespace Lists
{
    public class LinkedList<E> : IList<E>
    {
        private int length;
        private Node<E> Head;
        private Node<E> Tail;
        private E[] array;

        public LinkedList(){
            Head = null;
            length = 0;
        }

        public int Length(){
            return length;
        }

        public void Add(E item){
            try
            {
                Node<E> current = new Node<E>(item);

                if (Head == null)
                {
                    Head = current;
                    Tail = Head;
                    length++;
                    return;
                }

                Tail.next = current;
                Tail = Tail.next;
                length++;
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public void Remove(E item)
        {
            try
            {
                Node<E> current = Head;
                Node<E> prev = null;

                if (current != null)
                {
                    if (current.data.Equals(item))
                    {
                        Head = current.next;
                        length--;
                        return;
                    }

                    while (current != null)
                    {
                        prev = current;
                        current = current.next;
                        if (current.data.Equals(item))
                        {
                            prev.next = current.next;
                            length--;
                            return;
                        }
                    }
                }
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public void RemoveAll()
        {
            Head = null;
            Tail = null;
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
            Node<E> current = Head;

            while (current != null)
            {
                if (current.data.Equals(item))
                {
                    return true;
                }
                current = current.next;
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
            Node<E> current = Head;

            while(current != null)
            {
                if (current.data.Equals(item))
                {
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

            if(index >= length)
            {
                throw new IndexOutOfRangeException("Index out of bounds");
            }

            while(current != null && i < index)
            {
                current = current.next;
                i++;
            }

            if(current == null)
            {
                throw new NullReferenceException("Item not Found");
            }

            return current.data;            
        }

        public IList<E> Reverse()
        {
            E[] straightList = ToArray();

            LinkedList<E> list = new LinkedList<E>();

            for(int i = straightList.Length-1; i > -1; i--)
            {
                list.Add(straightList[i]);
            }

            return list;
        }
    }
}