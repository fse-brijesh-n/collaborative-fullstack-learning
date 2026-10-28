class Q{
	int x=10;
	String y=x+"Yoyo";
	int m(String a) {
		x++;
		y+=a;
		return x;
	}
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectQues8 {
	public static void main(String[] args) {
		Q q1=new Q();
		Q q2=new Q();
		int a=q1.m("KK");
		q2.m("RRR");
		q1.show();
		q2.show();
		q2.x=a;
		System.out.println(q2.x);
	}
}