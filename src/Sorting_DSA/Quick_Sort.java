package Sorting_DSA;
import java.util.Arrays;
import java.util.Scanner;
/*
Time complexity
Best| avg case = O(N log N)
worst case = O(N^2) due to pivot selection
*/
public class Quick_Sort {
	private static void sort(int arr[],int low,int high) {
		int start=low;
		int end=high;
		if(start>=end) 
			return;
		int mid=(start+end)/2;
		int pivot=arr[mid];
		while(start<=end) {
			while(arr[start]<pivot) start++;
			while(arr[end]>pivot) end--;
			if(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		sort(arr,low,end);
		sort(arr,start,high);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
