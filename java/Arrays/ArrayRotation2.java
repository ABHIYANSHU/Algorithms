package Arrays;

/**
 * Moving one element at a time.
 * Time Complexity: O(n*d)
 * Space Complexity: O(1)
 */
public class ArrayRotation2<E>
{
    private E[] elements;

    public ArrayRotation2(E[] elements, int d, boolean left)
    {
        int n = elements.length;
        if (d > n)
        {
            throw new ArrayIndexOutOfBoundsException("Rotating Element Greater than Length of Array");
        }
        if (left)
        {
            for (int i=0;i<d;i++)
            {
                E temp = elements[0];
                for (int j=1;j<n;j++)
                {
                    elements[j-1] = elements[j];
                }
                elements[n-1] = temp;
            }
        }
        else
        {
            for (int i=0;i<d;i++)
            {
                E temp = elements[n-1];
                for (int j=0;j<n-1;j++)
                {
                    elements[j+1] = elements[j];
                }
                elements[0] = temp;
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