package Queues;
class Node
{
	Node next;
	int data;
	public Node(int data)
	{
		this.data=data;
	}
}
class Chain
{
	
	Node front=null;
	Node rear=null;
	public void enqueue(int data) 
	{
		Node newNode=new Node(data);
		if(front==null) {
			front=newNode;
			rear=front;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
	}
	
	public void dequeue() {
		if(front==null) return;
		else {
			front=front.next;
		}
	}
	
	public void display() {
		if(front==null) return;
		else
		{
			Node temp=front;
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}	
}
public class LinearQueue 
{
	public static void main(String args[]) 
	{
		Chain queue=new Chain();
		for(int i=0;i<5;i++)
		{
			queue.enqueue(i+1);
		}
		queue.dequeue();
		queue.display();
	}
}
