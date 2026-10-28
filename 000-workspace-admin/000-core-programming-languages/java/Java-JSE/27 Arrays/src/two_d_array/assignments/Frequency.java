package two_d_array.assignments;
import two_d_array.SetGet2DArray;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1 ");
		int n1=sc.nextInt();
		System.out.println("Enter the size of n2 ");
		int n2=sc.nextInt();
		
		int[] arr[]=new int[n1][n2];
		SetGet2DArray.setArray(arr);
		SetGet2DArray.getArray(arr);
		int frequency[]=freqArray(arr);
		printFrequencyCount(frequency);

		sc.close();
	}
	
	public static int[] freqArray(int a[][]) {
		
		int max=ArrayMax.maxArray(a);
		int count[]=new int[max+1];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				count[a[i][j]]+=1;
			}
		}
		return count;
		
	}
	public static void printFrequencyCount(int count[]) {
			
		for( int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println(i+" is occured ["+count[i]+"] times");
			}
			
		}		
	}

}

