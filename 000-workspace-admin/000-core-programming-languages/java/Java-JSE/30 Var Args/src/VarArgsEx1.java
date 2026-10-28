public class VarArgsEx1 {
	public static void main(String[] args) {
		//int ... x= {6,7,889};//error
		show();
		show(4);
		show(4,7);
		show(5,7,4,6,958,8,9,7,4,67);
		show(new int[] {5,3,2,6,4,8});
		//show(4.0,7);//error
	}
	static void show(int ... a) {
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}