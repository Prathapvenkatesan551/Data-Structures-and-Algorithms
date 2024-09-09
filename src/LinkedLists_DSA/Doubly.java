package LinkedLists_DSA;
class Node
{
	Node next;
	Node prev;
	int data;
	public Node(int data) {
		this.next=null;
		this.data=data;
		this.prev=null;
	}
}
class LinkedList{
	Node head=null;
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) 
			{
				temp=temp.next;
			}
			newNode.prev=temp;
			temp.next=newNode;
		}
	}
	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	
	public void insertAtPos(int data,int pos) {
		Node newNode=new Node(data);
		if(pos==0) {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
		else {
			Node temp=head;
			int n=0;
			while(temp.next!=null) {
				if(n==pos-1) {
					temp.next.prev=newNode;
					newNode.next=temp.next;
					newNode.prev=temp;
					temp.next=newNode;
				}
				n++;
				temp=temp.next;
			}
			if( pos==n+1) {
				temp.next=newNode;
				newNode.prev=temp;
			}
		}
	}
	
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else
		{
			head=head.next;
			head.prev=null;
		}
	}
	
	public void deleteAtEnd() {
		
		if(head==null) {
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.prev.next=null;
		}
	}
	
	public void print() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp=temp.next;
				
			}
			System.out.println(temp.data);
			System.out.println("Traverse back to front");
			while(temp.prev!=null) {
				System.out.println(temp.data);
				temp=temp.prev;
			}
			System.out.println(temp.data);
		}
	}
	
}
public class Doubly {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		for(int i=0;i<5;i++) {
//			list.insertAtBeginning(i+1);
			list.insertAtEnd(i+1);
		}
		list.insertAtPos(100, 5);
		list.print();
	}

}
