package Sorting_DSA;
import java.util.*;
/*
 Time Complexity 
 Worst Case - O(n^2)
 */
public class Insertion_Sort
{
	private static void sort(int arr[]) 
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0) {
				if(arr[j]>temp)
				{
					arr[j+1]=arr[j];
					j--;
				}
			}
			arr[j+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	sort(arr);
	
	}
}
