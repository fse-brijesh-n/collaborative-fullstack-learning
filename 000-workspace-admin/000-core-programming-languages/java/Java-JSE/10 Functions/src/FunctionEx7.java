public class FunctionEx7 {
	static int findMax(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		System.out.println("Max: "+findMax(45,78));
		System.out.println("Max: "+findMax(56,98));
		System.out.println("Max: "+findMax(43,21));
		System.out.println("Max: "+findMax(6767,43));
	}
}
