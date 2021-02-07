import Arrays.ArrayRotation1;
import Arrays.ArrayRotation2;
import Arrays.ArrayRotation3;

public class Program
{
    public static void main(String[] args)
    {
        Integer[] a = new Integer[10000];        
        for (int i=0; i<10000; i++)
            a[i] = i;

        long start = System.currentTimeMillis();
        new ArrayRotation1<Integer>(a, 1000, true);
        System.out.println(System.currentTimeMillis()-start);
        
        start = System.currentTimeMillis();
        new ArrayRotation2<Integer>(a, 1000, true);
        System.out.println(System.currentTimeMillis()-start);
        
        start = System.currentTimeMillis();
        new ArrayRotation3<Integer>(a, 1000, true);
        System.out.println(System.currentTimeMillis()-start);

    }
}