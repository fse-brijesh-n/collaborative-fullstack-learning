class A{
	int x=10;
	static String y="Ram";
	void show() {
		System.out.println(x+y);
	}
}
public class StaticQues1 {
	public static void main(String[] args) {
		A a1=new A();
		a1.x=20; a1.y="Xyz";
		A a2=new A();
		a2.x=40; a2.y="Yoyo";
		a1.show();
		a2.show();
	}
}