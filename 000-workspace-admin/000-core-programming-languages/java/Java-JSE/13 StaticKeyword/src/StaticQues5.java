class AAAA{
	static int x;
	String y="KK";
	static double z=9;
	void show() {
		x++;
		System.out.println(x+y+z);
	}
	void m(String a) {
		z=x++ - z++;
		y=a+z;
	}
}
public class StaticQues5 {
	public static void main(String[] args) {
		AAAA a1=new AAAA();
		AAAA a2=new AAAA();
		a1.show();
		a1.m("PP");
		a2.show();
		a1.show();
	}
}
