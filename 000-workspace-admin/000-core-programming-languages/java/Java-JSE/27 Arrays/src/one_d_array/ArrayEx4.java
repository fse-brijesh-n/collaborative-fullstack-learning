package one_d_array;
public class ArrayEx4 {
	public static void main(String[] args) {
		int a[]=new int[] {6,'h',8,5,4};
		for (int x : a) {
			System.out.println(x);
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
		
		double b[]=new double[] {2.3,5,.8,7.1,4};
		for (double x : b) {
			System.out.println(x);
		}
		for(int x=0;x<b.length;x++) {
			System.out.println(b[x]);
		}
		
		String c[]=new String[] {"Hello","Hi","Ok"};
		for (String x : c) {
			System.out.println(x);
		}
		for(int x=0;x<c.length;x++) {
			System.out.println(c[x]);
		}
	}
}
