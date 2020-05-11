package Java.Lists;

public class Program {
    
    public static IList<Integer> list;

    public static void main(String[] args){
        ProcessLinkedList(1000);
        list = null;
        ProcessArrayList(1000);
        list = null;
        ProcessDoublyLinkedList(1000);
    }

    @SuppressWarnings("unused")
    public static void ProcessLinkedList(int n)
    {
        System.out.println("Linked List Started...............");
        System.out.println("--------------------------------------------------------------------------");

        InitializeLinkedList();
        AddLinkedList(n);
        int len1 = LengthLinkedList();
        RemoveLinkedList(n);
        int len2 = LengthLinkedList();
        int item = ItemAtLinkedList(len2);
        boolean exists = ExistsLinkedList(item);
        int index = IndexOfLinkedList(item);
        Integer[] array = ToArrayLinkedList();
        IterateLinkedList();
        RemoveAllLinkedList();

        System.out.println("Linked List Ended.................");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void InitializeLinkedList()
    {
        long watch = System.currentTimeMillis();

        list = new LinkedList<Integer>();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;
        System.out.println("Initializing took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void AddLinkedList(int n)
    {
        long watch = System.currentTimeMillis();

        for (int i = 0; i < n; i++)
            list.Add(i);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;
        System.out.println("Adding "+n+" items took : "+ watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static int LengthLinkedList()
    {
        long watch = System.currentTimeMillis();

        int n = list.Length();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Length of " + n + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return n;
    }

    public static void RemoveLinkedList(int n)
    {
        RemoveArrayList(n, true);
    }

    public static void RemoveLinkedList(int n, boolean even)
    {
        int i = even ? 0 : 1;

        long watch = System.currentTimeMillis();

        while (i < n)
        {
            list.Remove(i);
            i += 2;
        }

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Removing " + (n/2) + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static int ItemAtLinkedList(int n)
    {
        long watch = System.currentTimeMillis();

        int item = list.ItemAt(n / 2);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item at Index " + (n / 2) + " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return item;
    }

    public static int IndexOfLinkedList(int item)
    {
        long watch = System.currentTimeMillis();

        int index = list.IndexOf(item);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item " + item + " at Index "+index+ " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return index;
    }

    public static boolean ExistsLinkedList(int item)
    {
        long watch = System.currentTimeMillis();

        boolean exists = list.Exists(item);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item " +item+ " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return exists;
    }

    public static Integer[] ToArrayLinkedList()
    {
        long watch = System.currentTimeMillis();

        Integer[] array = list.ToArray();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Converting to Array took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return array;
    }

    @SuppressWarnings("unused")
    public static void IterateLinkedList()
    {
        long watch = System.currentTimeMillis();

        for(int val : list)
        {
            // No task performed
        }

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Traversing Linked List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void RemoveAllLinkedList()
    {
        long watch = System.currentTimeMillis();

        list.RemoveAll();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Removing all items from Linked List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    @SuppressWarnings("unused")
    public static void ProcessArrayList(int n)
    {
        System.out.println("Array List Started...............");
        System.out.println("--------------------------------------------------------------------------");

        InitializeArrayList();
        AddArrayList(n);
        int len1 = LengthArrayList();
        RemoveArrayList(n);
        int len2 = LengthArrayList();
        int item = ItemAtArrayList(len2);
        boolean exists = ExistsArrayList(item);
        int index = IndexOfArrayList(item);
        Integer[] array = ToArrayArrayList();
        IterateArrayList();
        RemoveAllArrayList();

        System.out.println("Array List Ended.................");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void InitializeArrayList()
    {
        long watch = System.currentTimeMillis();

        list = new ArrayList<Integer>();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;
        System.out.println("Initializing took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void AddArrayList(int n)
    {
        long watch = System.currentTimeMillis();

        for (int i = 0; i < n; i++)
            list.Add(i);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;
        System.out.println("Adding " + n + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static int LengthArrayList()
    {
        long watch = System.currentTimeMillis();

        int n = list.Length();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Length of " + n + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return n;
    }

    public static void RemoveArrayList(int n){
        RemoveArrayList(n, true);
    }

    public static void RemoveArrayList(int n, boolean even)
    {
        int i = even ? 0 : 1;

        long watch = System.currentTimeMillis();

        while (i < n)
        {
            list.Remove(i);
            i += 2;
        }

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Removing " + (n / 2) + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static int ItemAtArrayList(int n)
    {
        long watch = System.currentTimeMillis();

        int item = list.ItemAt(n / 2);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item at Index " + (n / 2) + " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return item;
    }

    public static boolean ExistsArrayList(int item)
    {
        long watch = System.currentTimeMillis();

        boolean exists = list.Exists(item);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item " + item + " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return exists;
    }

    public static int IndexOfArrayList(int item)
    {
        long watch = System.currentTimeMillis();

        int index = list.IndexOf(item);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item " + item + " at Index " + index + " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return index;
    }

    public static Integer[] ToArrayArrayList()
    {
        long watch = System.currentTimeMillis();

        Integer[] array = list.ToArray();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Converting to Array took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return array;
    }

    @SuppressWarnings("unused")
    public static void IterateArrayList()
    {
        long watch = System.currentTimeMillis();

        for(Integer val : list)
        {
            // No task performed
        }

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Traversing Array List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    static void RemoveAllArrayList()
    {
        long watch = System.currentTimeMillis();

        list.RemoveAll();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Removing all items from Array List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    @SuppressWarnings("unused")
    public static void ProcessDoublyLinkedList(int n)
    {
        System.out.println("Doubly Linked List Started...............");
        System.out.println("--------------------------------------------------------------------------");

        InitializeDoublyLinkedList();
        AddDoublyLinkedList(n);
        int len1 = LengthDoublyLinkedList();
        RemoveDoublyLinkedList(n);
        int len2 = LengthDoublyLinkedList();
        int item = ItemAtDoublyLinkedList(len2);
        boolean exists = ExistsDoublyLinkedList(item);
        int index = IndexOfDoublyLinkedList(item);
        Integer[] array = ToArrayDoublyLinkedList();
        IterateDoublyLinkedList();
        RemoveAllDoublyLinkedList();

        System.out.println("Doubly Linked List Ended.................");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void InitializeDoublyLinkedList()
    {
        long watch = System.currentTimeMillis();

        list = new DoublyLinkedList<Integer>();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;
        System.out.println("Initializing took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void AddDoublyLinkedList(int n)
    {
        long watch = System.currentTimeMillis();

        for (int i = 0; i < n; i++)
            list.Add(i);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;
        System.out.println("Adding " + n + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static int LengthDoublyLinkedList()
    {
        long watch = System.currentTimeMillis();

        int n = list.Length();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Length of " + n + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return n;
    }

    public static void RemoveDoublyLinkedList(int n){
        RemoveDoublyLinkedList(n, true);
    }

    public static void RemoveDoublyLinkedList(int n, boolean even)
    {
        int i = even ? 0 : 1;

        long watch = System.currentTimeMillis();

        while (i < n)
        {
            list.Remove(i);
            i += 2;
        }

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Removing " + (n / 2) + " items took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static int ItemAtDoublyLinkedList(int n)
    {
        long watch = System.currentTimeMillis();

        int item = list.ItemAt(n / 2);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item at Index " + (n / 2) + " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return item;
    }

    public static boolean ExistsDoublyLinkedList(int item)
    {
        long watch = System.currentTimeMillis();

        boolean exists = list.Exists(item);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item " + item + " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return exists;
    }

    public static int IndexOfDoublyLinkedList(int item)
    {
        long watch = System.currentTimeMillis();

        int index = list.IndexOf(item);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Finding Item " + item + " at Index " + index + " took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return index;
    }

    public static Integer[] ToArrayDoublyLinkedList()
    {
        long watch = System.currentTimeMillis();

        Integer[] array = list.ToArray();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Converting to Array took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");

        return array;
    }

    @SuppressWarnings("unused")
    public static void IterateDoublyLinkedList()
    {
        long watch = System.currentTimeMillis();

        for(Integer val : list)
        {
            // No task performed
        }

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Traversing Doubly Linked List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void RemoveAllDoublyLinkedList()
    {
        long watch = System.currentTimeMillis();

        list.RemoveAll();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Removing all items from Doubly Linked List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }
}