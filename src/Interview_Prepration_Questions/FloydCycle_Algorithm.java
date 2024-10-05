package Interview_Prepration_Questions;

public class FloydCycle_Algorithm {

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
