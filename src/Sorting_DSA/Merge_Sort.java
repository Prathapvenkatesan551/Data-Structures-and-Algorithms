package Sorting_DSA;
import java.util.Arrays;
import java.util.Scanner;
/*
Time complexity
worst case = O(N log N)
*/
public class Merge_Sort {
	private static int[] sort(int arr[]){
		if(arr.length==1) return arr;
		int mid=arr.length/2;
		
		int left[]=sort(Arrays.copyOfRange(arr, 0, mid));
		int right[]=sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}
	private static int[] merge(int left[],int right[])
	{
		int arr[]=new int[left.length+right.length];
		int i=0;
		int j=0;
		int index=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) arr[index++]=left[i++];
			else arr[index++]=right[j++];
		}
		if(i<left.length) {
			while(i<left.length) arr[index++]=left[i++];
		}
		else{
			while(j<right.length) arr[index++]=right[j++];
		}
		
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(sort(arr)));
	}

}
