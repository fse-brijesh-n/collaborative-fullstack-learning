package one_d_array;
import java.util.Scanner;

public class GetSetArray {

public static void main(String[] args) {
		
		GetSetArray gsa=new GetSetArray();
		gsa.array();		

	}

public static int[] setArray(int arr[]) {
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
	}
	sc.close();
	return arr;
}

public static void getArray(int arr[]) {
	for(int value:arr) {
		System.out.print(" "+value);
	}
}

public static int maxArray(int arr[]) {
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
			
	public void array() {
		//Without Array:
//		int a=90;
//		int b=3;
//		int c=6;
//		int d=8;
		
		//taking input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n;
		n=sc.nextInt();
	//Array-is a non-primitive data-structure which is collection of similar type of data in contiguous memory allocation with run time memory
		//declaring oneD array
//		int arr[n];//not allowed
//		int arr[] {1,23,5};//not alloedd
//		int arr[n]= {1,4,5,6,7};//not allowed
//		int arr[];//allowed
//		int[] arr;//allowed
		//initialization
//		int []arr= {1,2,3,4,5,6};//allowed
//		int []arr= {};//runtime error
//		int []arr=new int[];error
//		int []arr=new int[5];
//		arr[0]=0;
//		arr[1]=1;
//		arr[2]=2;
//		arr[3]=3;
//		arr[4]=4;
//		arr[5]=5;

		int arr[];//declare int type array variable for one dimentional array
		arr=new int[n];//creating object for array variable 
		System.out.print("Enter the vlaue of the array seperated by space:");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Entered array:");
		//foreach loop-only used to print sequentially value one by one from the array
		for(int value:arr) {
			System.out.print(" "+value);
		}
		sc.close();
	}
}