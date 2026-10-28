package one_d_array.assignments;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		inputArray(arr);
		System.out.print("Entered Array:");
		ArrayMax.getArray(arr);
		System.out.println();
		frequencyArray(arr);
		sc.close();
	}
	
	public static void frequencyArray(int a[]) {
		
		int max=maxArrayElement(a);
		
		int count[]=new int[max+1];
	
		for(int i=0; i<a.length; i++) {		
				count[a[i]]+=1;	
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]>0)
			System.out.println(i+" is occured ["+count[i]+"] times");
		}
		

	}
	
	public static int maxArrayElement(int arr[]) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int []inputArray(int arr[]){
		
		System.out.print("Enter "+arr.length+" elements seperated by space: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}

}
