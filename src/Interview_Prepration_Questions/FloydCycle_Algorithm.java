package Interview_Prepration_Questions;

public class FloydCycle_Algorithm {
	public void removeCycle(Node head) {
		Node n1=head;
        Node n2=head;
        Node prev=null;
        while(n2!=null && n2.next!=null)
        {
            n1=n1.next;
            n2=n2.next.next;
            if(n1==n2)
            	{
            	n1=head;
            	while(n1!=n2) {
            		prev=n2;
            		n1=n1.next;
            		n2=n2.next	;
            	}
            	prev.next=null;
            	return n1;
            	}
           
        }
        return null;
	}

	 public boolean hasCycle(Node head) {

	        Node n1=head;
	        Node n2=head;
	        while(n2!=null && n2.next!=null)
	        {
	            n1=n1.next;
	            n2=n2.next.next;
	            if(n1==n2) return true;
	           
	        }
	        return false;
	        
	        
	    }
	public static void main(String[] args) {
		
	}

}
