public class VarArgsEx4 {
	public static void main(String[] args) {
		add(4,8,7);
		add(4,8);
		add(4,8,67,78,9,0,5,89,45);
		add(4,'h');
	}
	static void add(int ... a) {
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		System.out.println("Sum: "+sum);
	}
}