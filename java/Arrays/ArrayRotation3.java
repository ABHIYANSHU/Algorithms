package Arrays;

/**
 * Moving Each element at a time to their respective position
 * Time Compexity: O(n)
 * Space Complexity: O(1)
 */
public class ArrayRotation3<E> implements ArrayRotation<E>
{
    private E[] elements;

    public ArrayRotation3(E[] elements, int d, boolean left)
    {
        int n = elements.length;
        int i = 0, noOfElementsVisited = 0;
        E lastVisited = null;
        if (d > n)
        {
            throw new ArrayIndexOutOfBoundsException("Rotating Element Greater than Length of Array");
        }
        if (left)
        {            
            while (noOfElementsVisited < n)
            {
                int pos = i - d;
                if (pos < 0)
                    pos = n - (d - i);
                
                E temp = null;
                if (noOfElementsVisited==0)
                {
                    temp = elements[pos];
                    elements[pos] = elements[i];
                    lastVisited = temp;
                    noOfElementsVisited++;
                    i = pos;
                }
                else
                {
                    temp = elements[pos];
                    elements[pos] = lastVisited;
                    lastVisited = temp;
                    noOfElementsVisited++;
                    i = pos;
                }
            }
        }
        else
        {
            i = n-1;
            while (noOfElementsVisited < n)
            {
                int pos = i + d;
                if (pos >= n)
                    pos = d + i - n;
                
                E temp = null;
                if (noOfElementsVisited==0)
                {
                    temp = elements[pos];
                    elements[pos] = elements[i];
                    lastVisited = temp;
                    noOfElementsVisited++;
                    i = pos;
                }
                else
                {
                    temp = elements[pos];
                    elements[pos] = lastVisited;
                    lastVisited = temp;
                    noOfElementsVisited++;
                    i = pos;
                }
            }
        }
        this.elements = elements;
    }

    @Override
    public String toString()
    {
        String s = "[";
        for (E e : elements) 
        {
            s = s + e.toString() + ",";
        }
        s = s.substring(0, s.length()-1);
        s = s + "]";
        return s;
    }
}
