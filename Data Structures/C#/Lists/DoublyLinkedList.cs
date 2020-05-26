using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Lists
{
    public class DoublyLinkedList<E> : IList<E>
    {
        private DoubleNode<E> Head;
        private DoubleNode<E> Tail;
        private E[] array;
        private int length;

        public DoublyLinkedList()
        {
            Head = null;
            Tail = null;
            length = 0;
        }

        public void Add(E item)
        {
            try
            {
                DoubleNode<E> current = new DoubleNode<E>(item);

                if (Head == null)
                {
                    Head = current;
                    Tail = Head;
                    length++;
                    return;
                }

                current.previous = Tail;
                current.next = null;
                Tail.next = current;
                Tail = current;
                length++;
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public bool Exists(E item)
        {
            DoubleNode<E> start = Head;

            while (start != null)
            {
                if (start.data.Equals(item))
                {
                    return true;
                }
                start = start.next;
            }

            return false;
        }

        public IEnumerator GetEnumerator()
        {
            if (this.array == null)
            {
                ToArray();
            }
            return this.array.GetEnumerator();
        }

        public int IndexOf(E item)
        {
            DoubleNode<E> start = Head;

            int i = 0;
            while (start != null)
            {
                if (start.data.Equals(item))
                {
                    return i;
                }
                i++;
                start = start.next;
            }

            return -1;
        }

        public E ItemAt(int index)
        {
            int i;
            int len = Length();
            DoubleNode<E> current = null;

            if(index >= len)
            {
                throw new IndexOutOfRangeException("Index out of bounds");
            }
            if (index > (len / 2))
            {
                current = Tail;
                i = len;
                while (current != null)
                {
                    if (i == index)
                    {
                        break;
                    }
                    current = current.previous;
                    i--;
                }
            }
            else
            {
                current = Head;
                i = 0;
                while (current != null)
                {
                    if (i == index)
                    {
                        break;
                    }
                    current = current.next;
                    i++;
                }
            }

            if(current == null)
            {
                throw new NullReferenceException("Item Not Found");
            }

            return current.data;
        }

        public int Length()
        {
            return length;
        }

        public void Remove(E item)
        {
            try
            {
                DoubleNode<E> start = Head;
                DoubleNode<E> prev = null;

                if (start != null)
                {
                    if (start.data.Equals(item))
                    {
                        Head = start.next;
                        Head.previous = null;
                        length--;
                        return;
                    }

                    while (start != null)
                    {
                        prev = start;
                        start = start.next;
                        if (start.data.Equals(item))
                        {
                            prev.next = start.next;
                            if (start.next == null)
                            {
                                start = start.previous;
                                Tail = start;
                            }
                            else
                            {
                                start = start.previous;
                                start.next.previous = start;
                                while (start.next != null)
                                {
                                    start = start.next;
                                }
                                Tail = start;
                            }
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

        public IList<E> Reverse()
        {
            DoubleNode<E> end = Tail;

            DoublyLinkedList<E> list = new DoublyLinkedList<E>();
            
            while (end.previous != null)
            {
                list.Add(end.data);
                end = end.previous;
            }

            return list;
        }

        public E[] ToArray()
        {
            E[] array = new E[length];

            int i = 0;

            DoubleNode<E> start = Head;

            while(start != null)
            {
                array[i] = start.data;
                i++;
                start = start.next;
            }

            this.array = array;
            return array;
        }
    }
}