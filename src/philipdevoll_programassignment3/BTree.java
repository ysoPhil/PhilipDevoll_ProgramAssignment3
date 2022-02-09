/*
 * Philip Devoll
 * Course: CSCI 3352 Section 01
 * Date: 4/12/2020
 * Programming Assignment 3
 * Environment: Windows 10 version 10.0.18362
 * Files: PhilipDevoll_ProgrammingAssignment3.java, BTree.java, Node.java
 * Purpose: BTree data model that uses nodes, and has data inserted them.
 * Input: recieves data from main program and inserts them
 * Output: prints sorted numbers and unsorted numbers
 * Algorithm: Insert data through nodes and then traverses those nodes to get order
 */
package philipdevoll_programassignment3;
/**
 *
 * @author Phil
 */
public class BTree 
{
    private Node root;
    
    //sets the root to null
    public BTree()
    {
        root = null;
    }
    
   //returns the root
    public Node getRoot() {
        return root;
    }
    // sets the root
    public void setRoot(Node root) {
        this.root = root;
    }
    
 
     //the Initial call to insert data
    public void insert(int data){root = insert(root, data);}
    //if the root is null it creates a new node for the data
    // or compares the data with data within that node and places them accordingly
    private Node insert(Node node,int data)
    {
        if (node == null) node = new Node(data);
                else
                {
                    if (data<=node.getData()) node.leftChild = insert(node.leftChild,data);
                    else node.rightChild = insert(node.rightChild,data);
                }
        return node;
    }
    
    //This method prints what was in the array by traversing through the nodes. 
    public void preorderTraversal(){ preorderTraversal(root);}
    private void preorderTraversal(Node root)
    {
        if (root != null)
        {
            System.out.print(root.getData() + " ");
            preorderTraversal(root.getLeftChild());
            preorderTraversal(root.getRightChild());
        }
    }
    
    //This method prints the data in the sorted order
    // as it traverses the nodes
    public void inorderTraversal() { inorderTraversal(root); }
    private void inorderTraversal(Node node) 
    {
        if (node != null) 
        {
            
            inorderTraversal(node.getLeftChild());
            System.out.print(node.getData() + " ");
            inorderTraversal(node.getRightChild());
        }
    }
}

