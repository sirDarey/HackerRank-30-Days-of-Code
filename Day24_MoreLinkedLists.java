package _30DaysOfCode;

/**
 *
 * @author Sir Darey
 */

public class Day24_MoreLinkedLists {
    
    class Node{
	int data;
	Node next;
	Node(int d){
            data=d;
            next=null;
        }	
    }
    
    Node removeDuplicates(Node head) {
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            while(temp != null && temp.data == current.data)
                temp = temp.next;
            current.next = temp;
            current = temp;            
        }
        return head;
    }
}

