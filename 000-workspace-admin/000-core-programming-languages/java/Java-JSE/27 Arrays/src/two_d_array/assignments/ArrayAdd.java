package two_d_array.assignments;
import two_d_array.SetGet2DArray;
import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1 ");
		int n1=sc.nextInt();
		System.out.println("Enter the size of n2 ");
		int n2=sc.nextInt();
		
		int[] arr[]=new int[n1][n2];
		SetGet2DArray.setArray(arr);
		SetGet2DArray.getArray(arr);
		System.out.println("Sum: "+AddArray(arr));
		sc.close();
	}
	
	public static int AddArray(int arr[][]) {
		int sum=0;
		for(int value[]:arr) {
			for(int x:value) {
				sum=sum+x;
			}
			
		}
		return sum;
		
	}

}
