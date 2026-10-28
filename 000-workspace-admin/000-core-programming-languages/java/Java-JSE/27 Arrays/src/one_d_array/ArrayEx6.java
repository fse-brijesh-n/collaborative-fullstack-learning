package one_d_array;
public class ArrayEx6 {
	public static void main(String[] args) {
		int a[]=new int[]{8,3,10,5,7,2,4,5,1,5};
		
		System.out.println(a[5]);
		
		show(a); //call or pass by reference 
		
		System.out.println(a[5]);
		
		int x=10;
		System.out.println(x);
		print(x); //call or pass by value 
		System.out.println(x);
	}
	static void show(int a[]) {
		a[5]=9000;
	}
	static void print(int x) {
		x=9000;
	}
}