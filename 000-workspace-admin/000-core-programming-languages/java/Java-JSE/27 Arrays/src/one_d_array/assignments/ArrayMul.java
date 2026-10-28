package one_d_array.assignments;

import java.util.Scanner;

public class ArrayMul {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.print("Enter the elements of array");
		ArrayMax.setArray(a);
		System.out.println("Entered elements");
		ArrayMax.getArray(a);
		System.out.println("\nMult: "+MultArray(a));
		
		sc.close();
	}
	
	public static int MultArray(int arr[]) {
		int mult=1;
		for(int value:arr) {
			mult=mult*value;
		}
		return mult;
		
	}

}
