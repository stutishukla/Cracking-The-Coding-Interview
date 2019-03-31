package linkedLists;

public class sumOfReversedLL {
	static Node head;
	Node totalSum=null;
	static class Node{
		Node next;
		int data;
		Node(int d){
			next=null;
			data=d;
		}
	}
	public void append(int data, Node node) {
		if(node==null) {
			node=new Node(data);
			System.out.println(node.data);
		}
		else {
			Node newNode=new Node(data);
			//System.out.println(newNode.data);

			while(node.next!=null) {
				node=node.next;
			}
			node.next=newNode;
			//System.out.println(node.data);
		}
	}
	public Node add(Node p, Node q) {
		
		
		int carry=0, sum=0;
		while(p!=null && q!=null) {
			sum=p.data+q.data+carry;
			//System.out.println("::::"+sum);
			if(sum>=10) {
				carry=1;
				sum=sum%10;
			}
			append(sum,totalSum);
			//System.out.println(totalSum.data);

			printList(totalSum);
			p=p.next;
			q=q.next;
		}
		if(p!=null) {
			//Node temp=p;
			while(p!=null) {
				sum=p.data+carry;
				append(sum,totalSum);
				carry=0;
			}
		}
		else if(q!=null) {
			//Node temp=p;
			while(q!=null) {
				sum=q.data+carry;
				append(sum,totalSum);
				carry=0;
			}
		}
		printList(totalSum);
		return totalSum;
	}
	public void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public static void main(String[] args) {
		sumOfReversedLL ll =new sumOfReversedLL();
		Node One=new Node(5);
		ll.append(2,One);
		ll.append(5, One);
		//ll.printList(One);
		Node Two= new Node(3);
		ll.append(8,Two);
		ll.append(2, Two);
		//ll.printList(Two);
		Node result=ll.add(One, Two);
		ll.printList(result);


	}

}
