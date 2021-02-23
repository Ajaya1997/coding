package gfg.linkedlist;

import gfg.linkedlist.LinkedList.Node;

public class LoopLength {

	public static void main(String[] args) {
			LinkedList list = new LinkedList();
		 	Node head = list.new Node(1);
		 	
		    head.next = list.new Node(2);  
		    head.next.next = list.new Node(3);  
		    head.next.next.next = list.new Node(4);  
		    head.next.next.next.next = list.new Node(5);  
		  
		    /* Create a loop for testing */
		    head.next.next.next.next.next = head.next; 
		    
		   countLoopLength(head);
	}

	private static void countLoopLength(Node head) {
		Node temp = head;
		Node slow = head;
		Node fast = head;
		boolean isLoop = false;
		int count = 1;
		if (head != null) {
			while (isLoop != true && fast != null && fast.next != null && slow != null) {
				slow = slow.next;
				fast = fast.next.next;
				if (fast == slow) {
					isLoop = true;
				}
			}
		}
		if(isLoop == true) {
			Node temp1 = slow;
			while(temp1.next!= slow) {
				temp1 = temp1.next;
				count++;
			}
			System.out.println(count);
		}
		else
			System.out.println("No loops");

	}


}
