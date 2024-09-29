package Stack_DSA;

class Node_S 
{
    int data;
    Node_S next;

    public Node_S(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack_S 
{
    Node_S head = null;

    public void push(int data) 
    {
        Node_S newNode = new Node_S(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop() 
    {
        if (head == null) 
        {
            System.out.println("Stack underflow! Nothing to pop.");
            return;
        }
        head = head.next;
    }

    public void peek() 
    {
        if (head == null) 
        {
            System.out.println("Stack is empty.");
        } 
        else 
        {
            System.out.println(head.data);
        }
    }

    public void isEmpty()
    {
        System.out.println(head == null);
    }

    public void print() 
    {
        if (head == null)
        {
            System.out.println("Stack is empty.");
            return;
        }
        Node_S temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Stack_SinglyLinkedList {
    public static void main(String args[]) {
        Stack_S stack = new Stack_S();
        for (int i = 0; i < 5; i++) 
        {
            stack.push(i + 1);
        }
        stack.print();
//        stack.peek();
//        stack.pop();
//        stack.print();
//        stack.isEmpty();
    }
}
