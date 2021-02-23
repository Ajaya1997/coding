package gfg.linkedlist;

import gfg.linkedlist.LinkedList.Node;

public class FindMiddleElement {

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
        for (int i=6; i>0; --i)
        {
            llist.push(i);
        }
        llist.printList();
        findMiddle(llist);
	}

	private static void findMiddle(LinkedList llist) {
		Node pointer1 = llist.head;
		Node pointer2 = llist.head;
		
		if(pointer1 !=null) {
			while(pointer2 !=null && pointer2.next!=null) {
				pointer1 = pointer1.next;
				pointer2 = pointer2.next.next;
			}
		}
		
		System.out.println(pointer1.data);
		
	}

}
