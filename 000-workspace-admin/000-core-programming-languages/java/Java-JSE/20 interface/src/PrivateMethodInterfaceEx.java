//in java 9 version private methods its access via static and default method in interface can't access out side the interface directly
interface M{
	void m();
	private void mno() {
		System.out.println("Hi MNO");
	}
	private static void pqr() {
		System.out.println("Hi PQR");
	}
	default void xyz() {
		System.out.println("Hello -XYZ");//default can access both private static and private non-static
		mno();
		pqr();
	}
	static void abc() {
		System.out.println("Hello -ABC");//static can access  private static methods
		//mno();//error
		pqr();
	}
}
class N implements M{
	public void m() {
		System.out.println("Hi N");
		//mno();//error
		xyz();
	}
}
public class PrivateMethodInterfaceEx {
	public static void main(String[] args) {
		M m=new N();
		m.m();
		M.abc();
	}
}