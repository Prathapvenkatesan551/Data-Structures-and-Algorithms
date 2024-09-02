package Sorting_DSA;

import java.util.Arrays;
import java.util.Scanner;
/*
Time Complexity 
Worst Case - O(n^2)
*/
public class Bubble_Sort {
	private static void sort(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		sort(arr);

	}

}