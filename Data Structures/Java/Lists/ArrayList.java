package Java.Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements IList<E> {
    private E[] array;
    private int length;

    public ArrayList()
    {
        array = (E[])Array.newInstance(GetE(1).getClass(), 16);
        length = 0;
    }

    private E GetE(Object o){
        E item = (E)o;
        return item;
    }

    public void Add(E item)
    {
        if(length < array.length) {
            array[length] = item;
            length++;
        } else {
            E[] newArray = (E[])Array.newInstance(GetE(1).getClass(), array.length * 2);
            int i;
            for (i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[i] = item;
            array = (E[])Array.newInstance(GetE(1).getClass(), newArray.length);;
            array = newArray;
            length++;
        }
    }

    public boolean Exists(E item)
    {
        for(int i = 0; i < Length(); i++)
        {
            if (array[i].equals(item))
            {
                return true;
            }
        }

        return false;
    }

    public Iterator<E> iterator()
    {
        E[] enumArray = (E[])Array.newInstance(GetE(1).getClass(), array.length);
        for(int i = 0;i < Length(); i++)
        {
            enumArray[i] = array[i];
        }

        return Arrays.stream(enumArray).iterator();
    }

    public int IndexOf(E item)
    {
        for(int i = 0; i < Length(); i++)
        {
            if (array[i].equals(item))
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
            throw new IndexOutOfBoundsException("Index out of bounds");
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
            if (array[i].equals(item))
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
        array = (E[])Array.newInstance(GetE(1).getClass(), 16);
    }

    public E[] ToArray()
    {
        E[] enumArray = (E[])Array.newInstance(GetE(1).getClass(), Length());
        for (int i = 0; i < Length(); i++)
        {
            enumArray[i] = array[i];
        }

        return enumArray;
    }
}