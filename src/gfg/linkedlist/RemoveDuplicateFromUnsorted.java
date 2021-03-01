package gfg.linkedlist;

import gfg.linkedlist.LinkedList.Node;

public class RemoveDuplicateFromUnsorted {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.head = list.new Node(10);
        list.head.next = list.new Node(12);
        list.head.next.next = list.new Node(11);
        list.head.next.next.next = list.new Node(11);
        list.head.next.next.next.next = list.new Node(12);
        list.head.next.next.next.next.next = list.new Node(11);
        list.head.next.next.next.next.next.next = list.new Node(10);
 
        System.out.println("Linked List before removing duplicates : \n ");
        list.printList();
        
        removeDuplicate(list);
        list.printList();
	}

	private static void removeDuplicate(LinkedList list) {
		Node temp1 = list.head;
		Node temp2 = null;
		Node prev = null;
		
		while(temp1 != null && temp1.next!=null) {
			temp2 = temp1.next;
			prev = temp1;
			
			while(temp2 != null) {
				if(temp1.data == temp2.data) {
					//prev.next 
					temp2 = temp2.next.next;
				}
				else {
					temp2 = temp2.next;
				}
				prev = prev.next;
			}
			temp1 = temp1.next;
		}
	}

}
