package gfg.linkedlist;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}
	
	public void removeAll(int key) {
		Node temp = head, prev = temp;

		if (temp != null && temp.data == key) {
			head = temp.next;
		}

		while (temp != null) {
			
			if (temp.data == key) {
				prev.next = temp.next;
			}
			prev = temp;
			temp = temp.next;
		}

	}
	
	public void removeNode(int value) {
		Node temp = head, prev = null;
		
		if(temp!=null && temp.data == value) {
			head = temp.next;
		}
		
		while(temp!=null) {
			
			if(temp.data == value) {
				prev.next = temp.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(3);
		list.push(6);
		list.push(3);
		
		list.printList();
		list.removeNode(6);
		list.removeAll(3);
		list.printList();
	}

}
