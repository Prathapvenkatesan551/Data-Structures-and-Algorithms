package LinkedLists_DSA;
class Node
{
	
	Node next;
	int data;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
 class LinkedList
 {
	Node head=null;
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
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
			head=newNode;
		}
	}
	public void insertAtPosition(int data,int pos) {
		Node newNode=new Node(data);
		if(pos==0) {
			newNode.next=head;
			head=newNode;
		}
		else
		{
			Node temp=head;
			int n=0;
			while(temp.next!=null)
			{
				if(n==pos-1) 
				{
					newNode.next=temp.next;
					temp.next=newNode;
					return ;
				}
				temp=temp.next;
				n++;
			}
			if(n==pos-1) {
				newNode.next=temp.next;
				temp.next=newNode;
			}
		}
	}
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else
		{
			head=head.next;
		}
	}
	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else if(head.next==null) {
			head=null;
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	
	public void deleteAtPos(int pos)
	{
		
		if(pos==0) {
			head=head.next;
		}
		else
		{
			Node temp=head;
			int n=0;
			while(temp.next!=null) {
				if(n==pos-1) {
					temp.next=temp.next.next;
					return;
				}
				temp=temp.next;
				n++;
			}
			if(n==pos-1 && pos<=n) 
			{
//				try {
				temp.next=temp.next.next;
//				}
//				catch(Exception e) {}
				
			}
		}
		
	}
	
	public void print() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
			
	}
}
public class Singly {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		for(int i=0;i<5;i++) 
		{
			list.insertAtEnd(i+1);
//			list.insertAtBeginning(i+1);
		}
//		list.insertAtPosition(100, 5);
//		System.out.println("Done");
//		list.deleteAtEnd();
		list.deleteAtPos(5);
		list.print();

	}

}
