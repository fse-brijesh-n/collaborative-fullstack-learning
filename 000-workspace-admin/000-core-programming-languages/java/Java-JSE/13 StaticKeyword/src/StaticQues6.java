
class Q{
	static int x;
	String y="KK";
	void show() {
		System.out.println(x+y);
		x++;
	}
}
public class StaticQues6 {
	public static void main(String[] args) {
		Q q1=new Q();
		Q q2=new Q();
		q1.show();
		++Q.x;
		q2.show();
		q1.show();
	}
}
