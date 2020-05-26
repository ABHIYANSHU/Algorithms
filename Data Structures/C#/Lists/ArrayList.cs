using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Lists
{
    public class ArrayList<E> : IList<E>
    {
        private E[] array;
        private int length;

        public ArrayList()
        {
            array = new E[16];
            length = 0;
        }

        private ArrayList(int i)
        {
            array = new E[i];
            length = 0;
        }

        public void Add(E item)
        {
            if(length < array.Length)
            {
                array[length] = item;
                length++;
            }
            else
            {
                E[] newArray = new E[array.Length * 2];
                int i;
                for(i = 0; i < array.Length; i++)
                {
                    newArray[i] = array[i];
                }
                newArray[i] = item;
                array = new E[newArray.Length];
                array = newArray;
                length++;
            }
        }

        public bool Exists(E item)
        {
            for(int i = 0; i < Length(); i++)
            {
                if (array[i].Equals(item))
                {
                    return true;
                }
            }

            return false;
        }

        public IEnumerator GetEnumerator()
        {
            E[] enumArray = new E[Length()];
            for(int i = 0;i < Length(); i++)
            {
                enumArray[i] = array[i];
            }

            return enumArray.GetEnumerator();
        }

        public int IndexOf(E item)
        {
            for(int i = 0; i < Length(); i++)
            {
                if (array[i].Equals(item))
                {
                    return i;
                }
            }

            return -1;
        }

        public E ItemAt(int index)
        {
            if(index > Length() || index < 0)
            {
                throw new IndexOutOfRangeException("Index out of bounds");
            }

            return array[index];
        }

        public int Length()
        {
            return length;
        }

        public void Remove(E item)
        {
            int indexPrevious = 0;

            for(int i = 0; i < Length(); i++)
            {
                if (array[i].Equals(item))
                {
                    indexPrevious = i;
                    length--;
                    break;
                }
            }

            for(int i = indexPrevious; i < Length(); i++)
            {
                array[i] = array[i + 1];
            }            
        }

        public void RemoveAll()
        {
            array = new E[16];
        }

        public IList<E> Reverse()
        {
            E[] straightList = ToArray();

            ArrayList<E> list = new ArrayList<E>(straightList.Length);

            for(int i = straightList.Length-1; i > -1; i--)
            {
                list.Add(straightList[i]);
            }

            return list;
        }

        public E[] ToArray()
        {
            E[] enumArray = new E[Length()];
            for (int i = 0; i < Length(); i++)
            {
                enumArray[i] = array[i];
            }

            return enumArray;
        }
    }
}
