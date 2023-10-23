class LinkedList : ILinkedList
{
    private Node? head;

    public Node addAfter(Node indexNode, Node newNode)
    {
        throw new NotImplementedException();
    }

    public void addFirst(Node newNode)
    {
        if(head == null)
            head = newNode;
        else
        {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;





        }
    }

    public void addLast(Node newNode)
    {
        throw new NotImplementedException();
    }

    public double average()
    {
        throw new NotImplementedException();
    }

    public int countOldNode()
    {
        throw new NotImplementedException();
    }

    public Node Find(object obj)
    {
        throw new NotImplementedException();
    }

    public Node findLastMaxSrt()
    {
        throw new NotImplementedException();
    }

    public Node findLastMin()
    {
        throw new NotImplementedException();
    }

    public Node findNodeAfter(int value)
    {
        throw new NotImplementedException();
    }

    public Node findNodeBefore(int value)
    {
        throw new NotImplementedException();
    }

    public Node FinMaxEvenNode()
    {
        throw new NotImplementedException();
    }

    public void PrintList()
    {
        throw new NotImplementedException();
    }

    public void remove(Node node)
    {
        throw new NotImplementedException();
    }

    public void removeAfter(Node q)
    {
        throw new NotImplementedException();
    }

    public int sumAll()
    {
        throw new NotImplementedException();
    }


    public void displayToDirecNext()
    {
        displayHelperNext(head);
    }

    public void displayToDirecPrev()
    {
        displayHelperPrev(head);
    }

    private void displayHelperNext(Node nodeHead)
    {
        if(nodeHead.next != null)
        {
            Console.WriteLine($"{nodeHead.data}");
            displayHelperNext(nodeHead.next);
        }
        else
        Console.WriteLine($"{nodeHead.data}");
    }

    private void displayHelperPrev(Node nodeHead)
    {

        if (nodeHead == null)
        {
            return;
        }

        if(nodeHead.next != null)
        {
            displayHelperPrev(nodeHead.next);
        }
        else
        {
            if(nodeHead.prev != null)
            {
                Console.WriteLine($"{nodeHead.data}");
                Thread.Sleep(2000);
                displayHelperPrev(nodeHead.prev);

            }
            else
            {
                Console.WriteLine($"{nodeHead.data}");
                return;

            } 

        }
        

    } 

}