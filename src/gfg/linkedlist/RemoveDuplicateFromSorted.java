package gfg.linkedlist;

import gfg.linkedlist.LinkedList.Node;

public class RemoveDuplicateFromSorted {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
         
        System.out.println("List before removal of duplicates");
        llist.printList();
        
        removeDuplicate(llist);
        llist.printList();
	}

	private static void removeDuplicate(LinkedList llist) {
		Node curr = llist.head;
		
		while (curr !=null) {
			Node temp = curr.next;
			
			while(temp !=null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
			
		}
	}

}
