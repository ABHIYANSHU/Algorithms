package Java.Lists;

public class Program {
    
    public static IList<Integer> list;

    public static void main(String[] args){
        //LinkedList(1000);
        //list = null;
        //ArrayList(1000);
        //list = null;
        //DoublyLinkedList(1000);
        //list = null;
        //CircularLinkedList(1000);

        DoublyCircularLinkedList<Integer> dcll = new DoublyCircularLinkedList<Integer>();
        dcll.Add(1);
        dcll.Add(2);
    }

    public static void LinkedList(int n)
    {
        System.out.println("Linked List Started...............");
        System.out.println("--------------------------------------------------------------------------");

        InitializeLinkedList();
        ProcessList(n);

        System.out.println("Linked List Ended.................");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void ArrayList(int n)
    {
        System.out.println("Array List Started...............");
        System.out.println("--------------------------------------------------------------------------");

        InitializeArrayList();
        ProcessList(n);

        System.out.println("Array List Ended.................");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void DoublyLinkedList(int n)
    {
        System.out.println("Doubly Linked List Started...............");
        System.out.println("--------------------------------------------------------------------------");

        InitializeDoublyLinkedList();
        ProcessList(n);

        System.out.println("Doubly Linked List Ended.................");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void CircularLinkedList(int n)
    {
        System.out.println("Circular Linked List Started...............");
        System.out.println("--------------------------------------------------------------------------");

        InitializeCircularLinkedList();
        ProcessList(n);

        System.out.println("Circular Linked List Ended.................");
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

    public static void InitializeCircularLinkedList()
    {
        long watch = System.currentTimeMillis();

        list = new CircularLinkedList<Integer>();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;
        System.out.println("Initializing took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    @SuppressWarnings("unused")
    public static void ProcessList(int n)
    {
        AddList(n);
        int len1 = LengthList();
        RemoveList(n);
        int len2 = LengthList();
        int item = ItemAtList(len2);
        boolean exists = ExistsList(item);
        int index = IndexOfList(item);
        Integer[] array = ToArrayList();
        IterateList();
        RemoveAllList();
    }

    public static void AddList(int n)
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

    public static int LengthList()
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

    public static void RemoveList(int n)
    {
        RemoveList(n, true);
    }

    public static void RemoveList(int n, boolean even)
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

    public static int ItemAtList(int n)
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

    public static int IndexOfList(int item)
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

    public static boolean ExistsList(int item)
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

    public static Integer[] ToArrayList()
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
    public static void IterateList()
    {
        long watch = System.currentTimeMillis();

        for(Integer val : list)
        {
            // No task performed
        }

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Traversing List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void RemoveAllList()
    {
        long watch = System.currentTimeMillis();

        list.RemoveAll();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        watch = System.currentTimeMillis() - watch;

        System.out.println("Removing all items from List took : " + watch + " milli - seconds.");
        System.out.println("Memory Used : " + memory + " bytes.");
        System.out.println("--------------------------------------------------------------------------");
    }
}