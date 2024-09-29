package Stack_DSA;
class Node
{
	Node next;
	int data;
	Node prev;
	public Node(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
 class StackBox{
Node head=null;
	
	public void push(int data) {
		Node newNode=new Node(data);
		if(head==null) head=newNode;
		else
		{
			newNode.prev=head;
			head.next=newNode;
			head=newNode;
		}
		
	}
	public void print() {
		if(head==null) return;
		else {
			Node temp=head;
			while(temp.prev!=null) {
				System.out.println(temp.data);
				temp=temp.prev;
				
			}
			System.out.println(temp.data);
		}
	}
	
	public void pop() {
		if(head==null) return;
		else
		{
			head=head.prev;
			head.next=null;
		}
	}
	
	public void peek() {
		if(head==null) return;
		else
		{
			System.out.println(head.data);
		}
	}
	
	public void isEmpty(){
		System.out.println(head==null);
	}
	
}
public class Stack {
	
	public static void main(String args[]) {
		StackBox stack=new StackBox();
		for(int i=0;i<5;i++)
		{
			stack.push(i+1);
		}
		stack.print();
//		stack.pop();
//		stack.peek();
//		stack.isEmpty();
		
	}

}
