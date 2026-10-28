package two_d_array;
import java.util.Arrays;

public class ArrayEx14 {
	public static void main(String[] args) {
		int a[]= {7,5,2,58,14,58,1,5,5,7,5,74};
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		Arrays.sort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(a));
		
		int x[]= {2,3,9};
		int y[]= {2,3,9};
		int z[]= {8,7,5,6};
		int yy[]= {9,2,3};
		System.out.println(Arrays.equals(x, y));
		System.out.println(Arrays.equals(x, z));
		System.out.println(Arrays.equals(x, yy));
	}
}
