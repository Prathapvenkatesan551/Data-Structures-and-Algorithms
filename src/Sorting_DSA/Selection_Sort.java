package Sorting_DSA;

import java.util.Arrays;
import java.util.Scanner;
/*
Time Complexity 
Worst Case - O(n^2)
*/
public class Selection_Sort {
	private static void sort(int arr[]) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=1+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
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
