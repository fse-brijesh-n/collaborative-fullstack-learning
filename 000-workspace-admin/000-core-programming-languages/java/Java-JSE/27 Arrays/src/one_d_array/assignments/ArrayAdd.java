package one_d_array.assignments;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.print("Enter the elements of array");
		ArrayMax.setArray(a);
		System.out.println("Entered elements");
		ArrayMax.getArray(a);
		System.out.println("\nSum: "+AddArray(a));
		
		sc.close();
	}
	
	public static int AddArray(int arr[]) {
		int sum=0;
		for(int value:arr) {
			sum=sum+value;
		}
		return sum;
		
	}

}
