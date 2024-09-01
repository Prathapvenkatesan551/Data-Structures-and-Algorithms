package Searching_DSA;
import java.util.*;
/*
Time complexity 
Worst case - O(log N)
*/
public class BinarySearch {
	private static int search(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int target=sc.nextInt();
		int result=search(arr,target);
		if(result!=-1) {
			System.out.println("Element found at index : "+ result);
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
