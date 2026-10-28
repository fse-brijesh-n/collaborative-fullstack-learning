package two_d_array;
import java.util.*;
public class SetGet2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1 ");
		int n1=sc.nextInt();
		System.out.println("Enter the size of n2 ");
		int n2=sc.nextInt();
		
		int[] arr[]=new int[n1][n2];
		
		setArray(arr);
		System.out.println();
		getArray(arr);
		sc.close();
	}
	
	public static int[][] setArray(int arr[][]) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the elements for "+(i+1)+"th rows ");

			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}
	
	
	
	public static int[][] getArray(int arr[][]) {
		System.out.println("Entered Array elements: ");
		for(int value[]:arr) {
			for(int x:value) {
				System.out.print(" "+x);
			}
			System.out.println();
		}
		
		
		
		return arr;
	}

}
