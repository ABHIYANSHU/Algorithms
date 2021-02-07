package Arrays;

/**
 * Using Temporary array
 * Time Complexity: O(n)
 * Space Complexity: O(d)
 */
public class ArrayRotation1<E> implements ArrayRotation<E>
{
    private E[] elements;

    @SuppressWarnings("unchecked")
    public ArrayRotation1(E[] elements, int d, boolean left)
    {
        int n = elements.length;
        if (d > n)
        {
            throw new ArrayIndexOutOfBoundsException("Rotating Element Greater than Length of Array");
        }
        if (left)
        {
            Object[] temp = new Object[d];
            for (int i=0;i<d;i++)
            {
                temp[i] = elements[i];
            }
            for (int i=d;i<n;i++)
            {
                elements[i-d] = elements[i];
            }
            for (int i=n-d;i<n;i++)
            {
                elements[i] = (E) temp[i - (n - d)];
            }
        }
        else
        {
            Object[] temp = new Object[d];
            for (int i=n-d;i<n;i++)
            {
                temp[i-(n-d)] = elements[i];
            }
            for (int i=n-1;i>=d;i--)
            {
                elements[i] = elements[i-d];
            }
            for (int i=0;i<d;i++)
            {
                elements[i] = (E) temp[i];
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