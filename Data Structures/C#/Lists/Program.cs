using System;
using System.Buffers;
using System.Diagnostics;

namespace Lists
{
    public class Program
    {
        public static IList<int> list;

        static void Main(string[] args)
        {
            try
            {
                LinkedList(1000);
                list = null;
                ArrayList(1000);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        #region LinkedList
        static void LinkedList(int n)
        {
            Console.WriteLine("Linked List Started...............");
            Console.WriteLine("--------------------------------------------------------------------------");

            InitializeLinkedList();
            ProcessList(n);

            Console.WriteLine("Linked List Ended.................");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static void InitializeLinkedList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            list = new LinkedList<int>();

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();
            Console.WriteLine("Initializing took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }
        #endregion

        #region ArrayList
        static void ArrayList(int n)
        {
            Console.WriteLine("Array List Started...............");
            Console.WriteLine("--------------------------------------------------------------------------");

            InitializeArrayList();
            ProcessList(n);

            Console.WriteLine("Array List Ended.................");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static void InitializeArrayList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            list = new ArrayList<int>();

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();
            Console.WriteLine("Initializing took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }
        #endregion

        #region List
        static void ProcessList(int n)
        {
            AddList(n);
            int len1 = LengthList();
            RemoveList(n);
            int len2 = LengthList();
            int item = ItemAtList(len2);
            bool exists = ExistsList(item);
            int index = IndexOfList(item);
            int[] array = ToArrayList();
            IterateList();
            RemoveAllList();        
        }

        static void AddList(int n)
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            for (int i = 0; i < n; i++)
                list.Add(i);

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();
            Console.WriteLine("Adding " + n + " items took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static int LengthList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            int n = list.Length();

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Finding Length of " + n + " items took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");

            return n;
        }

        static void RemoveList(int n, bool even = true)
        {
            int i = even ? 0 : 1;

            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            while (i < n)
            {
                list.Remove(i);
                i += 2;
            }

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Removing " + (n/2) + " items took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static int ItemAtList(int n)
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            int item = list.ItemAt(n / 2);

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Finding Item at Index " + (n / 2) + " took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");

            return item;
        }

        static int IndexOfList(int item)
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            int index = list.IndexOf(item);

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Finding Item " + item + " at Index " + index + " took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");

            return index;
        }

        static bool ExistsList(int item)
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            bool exists = list.Exists(item);

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Finding Item " +item+ " took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");

            return exists;
        }

        static int[] ToArrayList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            int[] array = list.ToArray();

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Converting to Array took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");

            return array;
        }

        static void IterateList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            foreach(int val in list)
            {
                // No task performed
            }

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Traversing List took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static void RemoveAllList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            list.RemoveAll();

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Removing all items from Linked List took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }
        #endregion

    }
}