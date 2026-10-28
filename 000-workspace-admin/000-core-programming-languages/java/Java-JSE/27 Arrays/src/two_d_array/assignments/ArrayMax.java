package two_d_array.assignments;
import two_d_array.SetGet2DArray;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1 ");
		int n1=sc.nextInt();
		System.out.println("Enter the size of n2 ");
		int n2=sc.nextInt();
		
		int[] arr[]=new int[n1][n2];
		SetGet2DArray.setArray(arr);
		SetGet2DArray.getArray(arr);
		System.out.println("Max: "+maxArray(arr));
		sc.close();
	}
	
	public static int maxArray(int arr[][]) {
		
		int max=arr[0][0];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		
		return max;
		
	}

}
