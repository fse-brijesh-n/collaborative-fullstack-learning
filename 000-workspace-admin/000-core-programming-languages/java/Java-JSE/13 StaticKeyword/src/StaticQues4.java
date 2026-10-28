class AAA{
	static int x=10;
	String y;
	void show() {
		x++;
		System.out.println(x+y);
	}
}
public class StaticQues4 {
	public static void main(String[] args) {
		AAA a1=new AAA();
		AAA a2=new AAA();
		a1.x=40; a2.y="Yoyo";
		a2.x=50; a1.y="Abc";
		a1.show();
		a2.show();
	}
}
