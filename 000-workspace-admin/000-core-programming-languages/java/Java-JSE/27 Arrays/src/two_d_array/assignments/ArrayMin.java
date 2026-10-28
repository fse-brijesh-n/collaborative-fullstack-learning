package two_d_array.assignments;
import two_d_array.SetGet2DArray;
import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1 ");
		int n1=sc.nextInt();
		System.out.println("Enter the size of n2 ");
		int n2=sc.nextInt();
		
		int[] arr[]=new int[n1][n2];
		SetGet2DArray.setArray(arr);
		SetGet2DArray.getArray(arr);
		System.out.println("Min: "+minArray(arr));
		sc.close();
	}
	
	public static int minArray(int arr[][]) {
		int min=arr[0][0];
		for(int value[]:arr) {
			for(int x:value) {
				 if(x<min) {
					 min=x;
				 }
			}
			
		}
		return min;
		
	}

}
