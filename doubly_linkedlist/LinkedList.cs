
using System.Dynamic;

enum Direction
{
    left,
    right
}

class LinkedList : ILinkedList
{
    private Node? _head;

    private Node? _tail;

    private Direction _direction = Direction.right;

    public Node addAfter(Node indexNode, Node newNode)
    {
        throw new NotImplementedException();
    }

    public void addFirst(Node newNode)
    {
        if(_head == null)
        {
            _head = newNode;
            _tail = newNode;
        }
        else
        {


             newNode.next = _head;
            _head.prev = newNode;
            _head = newNode;


        }
    }

    public Node? Head
    {
        get => _head;
        set => _head = value;
    }


    public Node? Tail
    {
        get => _tail;
        set => _tail = value;
    }


    public void addLast(Node newNode)
    {

        if(_tail == null)
        {
            _head = newNode;
            _tail = newNode;
        }
        else
        {
            newNode.next = null;
            newNode.prev = _tail;
            _tail = newNode;
        }


    }

    public double average()
    {
        throw new NotImplementedException();
    }

    public int countOldNode()
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
        displayHelperNext(_head);
    }

    public void displayToDirecPrev()
    {
        displayHelperPrev(_head);
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

            if(nodeHead.next != null && _direction == Direction.right)
            {
                displayHelperPrev(nodeHead.next);
            }
            else
            {
                _direction = Direction.left;

                if(nodeHead.prev != null && _direction == Direction.left)
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

    public bool Find(int data)
    {
        return FindHelper(_head,data);
    }


    public bool FindHelper(Node head,int data)
    {
        if(head != null)
        {
            if(head.data == data)
            return true;
            else
            return FindHelper(head.next,data);
        }
    
        return false;
    }

   
}