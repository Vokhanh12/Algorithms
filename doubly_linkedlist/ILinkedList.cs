using System.IO.Compression;

interface ILinkedList{

    int sumAll();

    double average();

    void addLast(Node newNode);

    void PrintList();

    void addFirst(Node newNode);

    Node Find(object obj);

    Node findNodeAfter(int value);

    Node findNodeBefore(int value);

    Node addAfter(Node indexNode , Node newNode);

    void remove(Node node);

    void removeAfter(Node q);

    Node findLastMin();

    Node findLastMaxSrt();

    int countOldNode();

    Node FinMaxEvenNode();


}