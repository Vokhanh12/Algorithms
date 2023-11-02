using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            LinkedList ll = new LinkedList();


            ll.addFirst(new Node(1));
            ll.addFirst(new Node(3));
            ll.addFirst(new Node(2));
            ll.addFirst(new Node(6));


            ll.displayToDirecNext();
            //ll.displayToDirecPrev();
            Console.WriteLine(""+ll.Find(100));


            Console.WriteLine($"Head:{ll.Head.data} Tail:{ll.Tail.data}");


            ll.addLast(new Node(9));

            ll.displayToDirecNext();

            Console.WriteLine(""+ll.Find(9));

             Console.WriteLine($"Head:{ll.Head.data} Tail:{ll.Tail.data}");



        }
    }
}