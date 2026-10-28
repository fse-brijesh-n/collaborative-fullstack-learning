class P{
	int x=90;
	String y="Ram";
	void m(int a) {
		show();
		x=a;
		y=x+"Hi"+y;
	}
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectQues7 {
	public static void main(String[] args) {
		P m1=new P();
		P m2=new P();
		m1.m(15);
		m2.m(10);
		m1.show();
		m2.show();
	}
}