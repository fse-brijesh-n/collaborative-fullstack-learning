package two_d_array;
import java.util.Scanner;
public class ArrayEx10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]a=new int[3][4];
		
		for(int x=0;x<a.length;x++) {
			System.out.println("Enter values for Array ");
			for(int y=0;y<a[x].length;y++) {
				a[x][y]=sc.nextInt();
			}
		}
		
		System.out.println("Entered Array Values Are:");
		for(int y[]:a) {
			for(int x:y) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
