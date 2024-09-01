package Searching_DSA;
import java.util.*;
/*
Time complexity 
Worst case - O(N)
*/
public class LinearSearch 
{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	
	int target=sc.nextInt();
	boolean isFound=false;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==target)
		{
			System.out.println("Element Fount at index : "+i);
			isFound=true;
			break;
		}
	}
	if(!isFound) {
		System.out.println("Element not Found");
	}
}
}
