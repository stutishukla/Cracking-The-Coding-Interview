package linkedLists;

public class kthToTheLastElement {
	Node head;
	
	static class Node{
		Node next;
		int data;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public Integer kThLastElem(int k) {
		Node temp=head;
		int length=0,i=1;
		while(temp!=null) {
			temp=temp.next;
			length=length+1;
		}
		temp=head;
		if(k>length)
			return null;
		else {
			int upadtedLength=length-(k-1);
			//System.out.println(upadtedLength);
			while(i<upadtedLength) {
				//System.out.println(temp.data);
				temp=temp.next;
				i++;
			}
		}
		
		return temp.data;
	}
	
	public void append(int data) {
		Node temp=head;
		Node newNode=new Node(data);
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		kthToTheLastElement ll=new kthToTheLastElement();
		ll.head=new Node(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.append(6);
		//ll.printList();
		int val=ll.kThLastElem(6);
		System.out.println(val);
		
	}

}
