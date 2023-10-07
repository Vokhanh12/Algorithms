fun main() {

    var binaryTree = BinaryTree();
    //5,1,9,2,7,3,6,4,8
    binaryTree.Insert(Node(5));
    binaryTree.Insert(Node(1));
    binaryTree.Insert(Node(9));
    binaryTree.Insert(Node(2));
    binaryTree.Insert(Node(7));
    binaryTree.Insert(Node(3));
    binaryTree.Insert(Node(6));
    binaryTree.Insert(Node(4));
    binaryTree.Insert(Node(8));

    //binaryTree.Display();
    println("${binaryTree.Search(9)}")
}

class BinaryTree(){
    var root :Node? = null;

    fun Insert(node: Node)
    {
        root = InsertHelper(root,node);
    }

    fun InsertHelper(root: Node?, node: Node) : Node
    {
        if(root == null)
            return node;
        else if(node.data < root.data)
            root.left = InsertHelper(root.left, node)
        else if(node.data > root.data)
            root.right = InsertHelper(root.right, node)

        return root
    }
    fun Display(dataSearch : Int)
    {

    }

    fun DisplayHelper(root : Node? ,dataSearchHelper : Int)
    {

    }

    fun Search(numSearch : Int) : Boolean
    {
        return  DisplaySearchHelper(root,numSearch)
    }

    fun DisplaySearchHelper(root : Node?, numSearchHelper : Int) : Boolean
    {
        if(root == null)
        {
            return  false
        }
        else if(root.data == numSearchHelper)
        {
            return true;
        }
        else if(numSearchHelper < root.data)
            return DisplaySearchHelper(root.left, numSearchHelper)
        else return DisplaySearchHelper(root.right, numSearchHelper)

    }


}


class Node(var data: Int)
{
    var left: Node? = null;
    var right: Node? = null;

}
