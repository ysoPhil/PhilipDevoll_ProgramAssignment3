/*
 * Philip Devoll
 * Course: CSCI 3352 Section 01
 * Date: 4/12/2020
 * Programming Assignment 3
 * Environment: Windows 10 version 10.0.18362
 * Files: PhilipDevoll_ProgrammingAssignment3.java, BTree.java, Node.java
 * Purpose: The node data model
 * Algorithm: A node with left and right child that, that has a data.
 */
package philipdevoll_programassignment3;

/**
 *
 * @author Phil
 */
public class Node 
{
    Node rightChild, leftChild;
    int data;
    
    //creates a node with no children and 0 for the data
    public Node()
    {
        rightChild = null;
        leftChild = null;
        data = 0;
    }
    
    //creates node with no children with data
    public Node(int data)
    {
        rightChild = null;
        leftChild = null;
        this.data = data;
    }
    
    //returns the right child of the node
    public Node getRightChild() {
        return rightChild;
    }

    //sets the right child of the node
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    //returns the left child of the node
    public Node getLeftChild() {
        return leftChild;
    }
    //sets the left child of the node
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    
    //returns the data held in the node
    public int getData() {
        return data;
    }

    //sets the data within the node
    public void setData(int data) {
        this.data = data;
    }
    
}
