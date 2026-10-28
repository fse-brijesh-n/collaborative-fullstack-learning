class Xv{
	final private void m1() {
		System.out.println("Hi X");
	}
}
class Yf extends Xv{
	void m1() {
		System.out.println("Hi Y");//child can make same method not affect to final private methods
		//because its selft methods
	}
}
public class FinalPrivateMethodEx {
	public static void main(String[] args) {
		
	}
}