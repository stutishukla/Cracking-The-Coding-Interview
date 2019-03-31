package linkedLists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDups {
	Node head;
	static class Node{
		Node next;
		int data;

		Node(int d){
			data=d;
			next=null;
		}
	}

	public void deleteDup() {
		Node temp=head, prev=null;
		Set<Integer> hset=new HashSet<Integer>();
		while(temp.next!=null) {
			if(hset.contains(temp.data)) {
                prev.next=temp.next;
                //prev=temp;
			}
			else {
				hset.add(temp.data);
			}
			prev=temp;
			temp=temp.next;
		}


	}
	public void printList() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}


	public static void main(String[] args) {
		RemoveDups ll= new RemoveDups();
		ll.head=new Node(1);
		ll.head.next=new Node(2);
		ll.head.next.next=new Node(2);
		ll.head.next.next.next=new Node(3);
		ll.head.next.next.next.next=new Node(4);
		ll.head.next.next.next.next.next=new Node(3);
		System.out.println("Before::");
		ll.printList();
		System.out.println("After::");
		ll.deleteDup();
		ll.printList();


	}

}
