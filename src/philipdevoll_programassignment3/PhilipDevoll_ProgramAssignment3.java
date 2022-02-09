/*
 * Philip Devoll
 * Course: CSCI 3352 Section 01
 * Date: 4/12/2020
 * Programming Assignment 3
 * Environment: Windows 10 version 10.0.18362
 * Files: PhilipDevoll_ProgrammingAssignment3.java, BTree.java, Node.java
 * Purpose: To access and sort using BTrees
 * Input: Randomly generated array
 * Output: sorted numbers
 * Algorithm: Inserts data into the BTrees
 */
package philipdevoll_programassignment3;

/**
 *
 * @author Phil
 */
public class PhilipDevoll_ProgramAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BTree tree = new BTree();
        
        for (int i = 0; i < 20; i++)tree.insert((int)(Math.random()*100) );
        tree.preorderTraversal();
        System.out.println();
        tree.inorderTraversal();
    }
}
