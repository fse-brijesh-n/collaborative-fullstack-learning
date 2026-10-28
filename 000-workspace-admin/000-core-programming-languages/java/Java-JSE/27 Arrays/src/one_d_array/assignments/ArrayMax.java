package one_d_array.assignments;
import java.util.Scanner;
public class ArrayMax {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		GetSetArray gsa=new GetSetArray();
//		gsa.array();//printing array using another package
//		gsa.main(args);//main method can also call
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.print("Enter the elements of array: "); 
//		getArray(setArray(a));//allowed
		
		setArray(a);
		System.out.print("Entered elements: ");
		getArray(a);
		System.out.println("\nmax: "+maxArray(a));
		sc.close();
		
		
	
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

}
