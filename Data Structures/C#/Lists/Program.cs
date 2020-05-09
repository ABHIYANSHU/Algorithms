using System;
using System.Buffers;
using System.Diagnostics;

namespace Lists
{
    class Program
    {
        public static IList<int> list;

        static void Main(string[] args)
        {
            try
            {
                ProcessLinkedList(1000);

                list = null;

                ProcessArrayList(1000);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        #region Linked List
        static void ProcessLinkedList(int n)
        {
            Console.WriteLine("Linked List Started...............");
            Console.WriteLine("--------------------------------------------------------------------------");

            InitializeLinkedList();
            AddLinkedList(n);
            int len1 = LengthLinkedList();
            RemoveLinkedList(n);
            int len2 = LengthLinkedList();
            int item = ItemAtLinkedList(len2);
            bool exists = ExistsLinkedList(item);
            int index = IndexOfLinkedList(item);
            int[] array = ToArrayLinkedList();
            IterateLinkedList();
            RemoveAllLinkedList();

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

        static void AddLinkedList(int n)
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            for (int i = 0; i < n; i++)
                list.Add(i);

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();
            Console.WriteLine("Adding "+n+" items took : "+ watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static int LengthLinkedList()
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

        static void RemoveLinkedList(int n, bool even = true)
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

        static int ItemAtLinkedList(int n)
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

        static int IndexOfLinkedList(int item)
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            int index = list.IndexOf(item);

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Finding Item " + item + " at Index "+index+ " took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");

            return index;
        }

        static bool ExistsLinkedList(int item)
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

        static int[] ToArrayLinkedList()
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

        static void IterateLinkedList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            foreach(int val in list)
            {
                // No task performed
            }

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Traversing Linked List took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static void RemoveAllLinkedList()
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

        #region Array List
        static void ProcessArrayList(int n)
        {
            Console.WriteLine("Array List Started...............");
            Console.WriteLine("--------------------------------------------------------------------------");

            InitializeArrayList();
            AddArrayList(n);
            int len1 = LengthArrayList();
            RemoveArrayList(n);
            int len2 = LengthArrayList();
            int item = ItemAtArrayList(len2);
            bool exists = ExistsArrayList(item);
            int index = IndexOfArrayList(item);
            int[] array = ToArrayArrayList();
            IterateArrayList();
            RemoveAllArrayList();

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

        static void AddArrayList(int n)
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

        static int LengthArrayList()
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

        static void RemoveArrayList(int n, bool even = true)
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

            Console.WriteLine("Removing " + (n / 2) + " items took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static int ItemAtArrayList(int n)
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

        static bool ExistsArrayList(int item)
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            bool exists = list.Exists(item);

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Finding Item " + item + " took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");

            return exists;
        }

        static int IndexOfArrayList(int item)
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

        static int[] ToArrayArrayList()
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

        static void IterateArrayList()
        {
            Stopwatch watch = Stopwatch.StartNew();
            long memory = GC.GetTotalMemory(true);

            foreach (int val in list)
            {
                // No task performed
            }

            memory = GC.GetTotalMemory(true) - memory;
            watch.Stop();

            Console.WriteLine("Traversing Array List took : " + watch.ElapsedMilliseconds + " milli - seconds.");
            Console.WriteLine("Memory Used : " + memory + " bytes.");
            Console.WriteLine("--------------------------------------------------------------------------");
        }

        static void RemoveAllArrayList()
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
