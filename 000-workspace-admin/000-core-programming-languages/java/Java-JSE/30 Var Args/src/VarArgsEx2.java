public class VarArgsEx2 {
	public static void main(String[] args) {
		//show();//error
		show(6.2);
		show(4);
		show(4,7);
		show(5,7,4,6,958,8,9,7,4,67);
		show(6.1,new int[] {5,3,2,6,4,8});
	}
//	static void show(int ... a,double b) { //var-args must be last parameter 
//	static void show(int ... a,double ... b) { //more then one var-args NOT allowed
	static void show(double b,int ... a) {
		System.out.print(b+" - ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}