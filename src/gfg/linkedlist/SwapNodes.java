package gfg.linkedlist;

class SwapNodes 
{
	static class Node {

		int data;
		Node next;

		// constructor
		Node(int val, Node next1) {
			data = val;
			next = next1;
		}

		void printList() {

			Node node = this;

			while (node != null) {

				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println();
		}
	}

	static Node push(Node head_ref, int new_data) {

		(head_ref) = new Node(new_data, head_ref);
		return head_ref;
	}

	static Node swapNodes(Node head_ref, int x, int y) {
		Node head = head_ref;
		if (x == y)
			return null;

		Node a = null, b = null;
		Node prev = head_ref, prev1 = head_ref;
		boolean ishead = false;
		
		while (head_ref.next != null) {
			
			if (head_ref.data == x) {
				a = head_ref;
			}

			else if (head_ref.data == y) {
				b = head_ref;
			}
			
			if(a == null) {
				prev = head_ref;
			}
			
			if(b == null) {
				prev1 = head_ref;
			}

			head_ref = ((head_ref).next);
		}
		
		if (a != null && b != null) {
			prev.next = b;
			head.printList();
			prev1.next = a;
			head.printList();
			Node temp = b.next;
			head.printList();
			b.next = a.next;
			head.printList();
			a.next = temp;
			head.printList();
		}
		
		
		if(head.data == x) {
			head = b;
		}
		
		else if(head.data == y) {
			head = a;
		}
		

		 
		
		return head;
	}

	public static void main(String args[]) {

		Node start = null;

		start = push(start, 7);
		start = push(start, 6);
		start = push(start, 5);
		start = push(start, 4);
		start = push(start, 3);
		start = push(start, 2);
		start = push(start, 1);

		System.out.print("Linked list before calling swapNodes() ");
		start.printList();

		start = swapNodes(start, 6, 1);

		System.out.print("Linked list after calling swapNodes() ");
		start.printList();
	}
} 
//contributed by Arnab Kundu 

