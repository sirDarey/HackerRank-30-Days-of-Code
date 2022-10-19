package _30DaysOfCode;

/**
 *
 * @author Sir Darey
 */

public class Day22_BSTs {
    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    } 
    
    static int maxHeight = 0;
    
    int getHeight(Node root){
        return recur(root, -1);
    }
    
    int recur (Node root, int heightSoFar) {
        if (root == null)
            return heightSoFar;
        
        maxHeight = Math.max(maxHeight, recur(root.left, heightSoFar+1));
        maxHeight = Math.max(maxHeight, recur(root.right, heightSoFar+1));
        return maxHeight;
    }
}

