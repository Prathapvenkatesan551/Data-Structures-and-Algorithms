package Interview_Prepration_Questions;

public class RemoveDuplicatesFrom_LinkedList 
{

	public ListNode deleteDuplicates(Node head) {
        Node left=head;
        Node right=left.next;
        while(right!=null)
        {
            if(left.val!=right.val){
                left.next=right;
                left=right;
                right=left.next;
            }
            else{ 
                      
                right=right.next;
            }
            
        }
        return head;
        
    }
	public static void main(String[] args) {
	
		
		
	}

}
