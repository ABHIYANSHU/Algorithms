import Arrays.ArrayRotation1;
import Arrays.ArrayRotation2;

public class Program
{
    public static void main(String[] args)
    {
        Integer[] a = new Integer[1000];        
        for (int i=0; i<1000; i++)
            a[i] = i;

        long start = System.currentTimeMillis();
        ArrayRotation1<Integer> arrayRotation1 = new ArrayRotation1<Integer>(a, 200, true);
        System.out.println(System.currentTimeMillis()-start);
        //System.out.println(arrayRotation1);

        start = System.currentTimeMillis();
        ArrayRotation2<Integer> arrayRotation2 = new ArrayRotation2<Integer>(a, 200, true);
        System.out.println(System.currentTimeMillis()-start);
        //System.out.println(arrayRotation2);

    }
}