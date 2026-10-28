public class FunctionEx6 {
	static boolean findEvenOdd(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=13;
		//boolean result=findEvenOdd(n);
		//if(result) {
		if(findEvenOdd(n)) {
			System.out.println(n+" is EVEN");
		}else {
			System.out.println(n+" is ODD");
		}
	}
}
