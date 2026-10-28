package one_d_array.assignments;

import java.util.Scanner;
public class ArrayMin {
		
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.print("Enter the elements: ");
		ArrayMax.setArray(a);
		System.out.print("Entered elements: ");
		ArrayMax.getArray(a);
		System.out.println("\nmin: "+minArray(a));
		sc.close();
	}
	
	public static int  minArray(int arr[]) {
		int min=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}
