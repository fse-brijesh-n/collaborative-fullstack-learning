package two_d_array;

public class ArrayEx9 {
	public static void main(String[] args) {
//		int a[]= {5,7,2,6};
//		int b[]= {7,3,9};
//		int c[]= {1,7,8,2,5,4};
		
		//int a[][];//allowed
		//int []a[];//allowed
		int [][]a;//allowed
		a=new int[][] {{5,7,2,6},{7,3,9},{1,7,8,2,5,4}};
		//int [][]a={{5,7,2,6},{7,3,9},{1,7,8,2,5,4}};//allowed
		System.out.println(a.length);
		System.out.println(a[2].length);
		

		System.out.println(a[2][4]);
		
		for(int x:a[0]) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:a[1]) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:a[2]) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		//or
		
		for(int y=0;y<a.length;y++) {
			for(int x:a[y]) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		//or
		
		for(int y[]:a) {
			for(int x:y) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		//or
		
		for(int y=0;y<a.length;y++) {
			for(int x=0;x<a[y].length;x++) {
				System.out.print(a[y][x]+" ");
			}
			System.out.println();
		}
	}
}