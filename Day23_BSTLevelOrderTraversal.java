package _30DaysOfCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sir Darey
 */

public class Day23_BSTLevelOrderTraversal {
    
    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    void levelOrder(Node root){
        
        Queue<Node> queue = new LinkedList<>();
        if(root.left != null)
            queue.offer(root.left);
        if (root.right != null)
            queue.offer(root.right);
        System.out.print(root.data);

        while(!queue.isEmpty()) {
            Node current = queue.poll(),
                    left = current.left,
                    right = current.right;
            System.out.print(" "+current.data);
            if(left != null)
                queue.offer(left);
            if (right != null)
                queue.offer(right);
        }
    }

}

