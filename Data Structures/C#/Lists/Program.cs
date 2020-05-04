using System;

namespace Lists
{
    class Program
    {
        static void Main(string[] args)
        {
            LinkedList<string> ll = new LinkedList<string>();
            ll.Add("a");
            ll.Add("b");
            ll.Add("c");
            ll.Remove("b");
            Console.WriteLine(ll.Length());
            foreach(string s in ll){
                Console.WriteLine(s);
            }
        }
    }
}
