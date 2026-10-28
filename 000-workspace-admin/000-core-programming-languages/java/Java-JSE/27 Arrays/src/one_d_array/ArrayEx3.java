package one_d_array;
import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Plz enter array size:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int x=0;x<a.length;x++) {
			System.out.println("Enter a number:");
			a[x]=sc.nextInt();
		}
		
		System.out.println("Array elements are:");
		for(int x:a) {
			System.out.println(x);
		}
		sc.close();
	}
}