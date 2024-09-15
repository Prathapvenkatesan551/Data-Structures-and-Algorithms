package LinkedLists_DSA;
class NodeC
{
	NodeC next;
	int data;
	public NodeC(int data) {
		this.data=data;
	}
	
}
class LinkedList_C{
	NodeC head=null;
	public void insertAtEnd(int data) {
		NodeC newNode=new NodeC(data);
		if(head==null) {
			head=newNode;
			head.next=head;
		}
		else
		{
			NodeC temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			newNode.next=head;
			temp.next=newNode;
			
		}
		
	}
	public void insertAtBeginning(int data) {
		NodeC newNode =new NodeC(data);
		if(head==null) {
			head=newNode;
			head.next=head;
		}
		else
		{
			NodeC temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			newNode.next=head;
			temp.next=newNode;
			head=newNode;
		}
	}
	
	public void insertAtPos(int data,int pos) {
		NodeC newNode=new NodeC(data);
		if(pos==0) {
			NodeC temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			newNode.next=temp.next;
			head=newNode;
			temp.next=head;
		}
		else
		{
			NodeC temp=head;
			int n=0;
			while(temp.next!=head)
			{
				if(n==pos-1) {
					newNode.next=temp.next;
					temp.next=newNode;
					return;
				}
				n++;
				temp=temp.next;
			}
			if(n==pos-1) {
				newNode.next=temp.next;
				temp.next=newNode;
				return;
			}
		}
	}
	
	public void deleteAtBeginning() {
		if(head==null) {
			return;
		}
		else {
			NodeC temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=head.next;
			head=temp.next;
		}
	}
	
	public void deleteAtEnd() {
		if(head==null) {
			return;
		}
		else {
			NodeC temp=head;
			while(temp.next.next!=head)
			{
				temp=temp.next;
			}
			temp.next=head;
		}
	}
	
	public void deleteAtPos(int pos) {
		if(pos==0) {
			NodeC temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=head.next;
			head=temp.next;
		}
		else
		{
			NodeC temp=head;
			int n=0;
			while(temp.next.next!=head)
			{
				if(n==pos-1) {
					temp.next=temp.next.next;
					return;
				}
				n++;
				temp=temp.next;
			}
			if(n==pos-1) {
				temp.next=temp.next.next;
				return;
			}
		}
	}
	public void reverse() {
		if(head==null) {
			return;
		}
		else
		{
			NodeC next=null;
			NodeC current=head;
			NodeC prev=null;
			while(current.next!=head) {
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
				
			}
			next=head;
			current.next=prev;
			head.next=current;
			head=current;
		}
	}
	public void print() {
		if(head==null) {
			System.out.println("Empty");
		}
		else
		{
			NodeC temp=head;
			while(temp.next!=head) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
}
public class Circular {

	public static void main(String[] args) {
		LinkedList_C list=new LinkedList_C();
	for(int i=0;i<5;i++)
	{
		list.insertAtEnd(i+1);
//		list.insertAtBeginning(i+1);
	}
//	list.insertAtPos(100, 5);
//	list.deleteAtBeginning();
//	list.deleteAtEnd();
//	list.deleteAtPos(5);
	list.reverse();
	list.print();

	}

}
