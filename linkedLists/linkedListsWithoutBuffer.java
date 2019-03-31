package linkedLists;

import java.util.HashSet;
import java.util.Set;

import linkedLists.RemoveDups.Node;
//Runner Technique
public class linkedListsWithoutBuffer {

	Node head;
	static class Node{
		Node next;
		int data;

		Node(int d){
			data=d;
			next=null;
		}
	}

	public void deleteDup(Node head) {
		Node current=head;
		while(current!=null) {
			Node runner=current;
			while(runner.next!=null) {
				//System.out.println(runner.next.data);
				if(runner.next.data==current.data) {
					runner.next=runner.next.next;
					System.out.println("::"+runner.data);
				}
				else {//for edge case handling. If no else is put, the corner case will fail as it might try to update runner with runner.next
					runner=runner.next;
					System.out.println(":::"+runner.data);

				}
			}
			current=current.next;
		}
	}
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		linkedListsWithoutBuffer ll= new linkedListsWithoutBuffer();
		ll.head=new Node(1);
		ll.head.next=new Node(2);
		ll.head.next.next=new Node(3);
		ll.head.next.next.next=new Node(2);
		ll.head.next.next.next.next=new Node(4);
		ll.head.next.next.next.next.next=new Node(3);
		ll.head.next.next.next.next.next.next=new Node(2);

		System.out.println("Before::");
		ll.printList();
		System.out.println("After::");
		ll.deleteDup(ll.head);
		ll.printList();


	}

}
