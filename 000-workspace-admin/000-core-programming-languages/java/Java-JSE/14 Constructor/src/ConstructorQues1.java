class P{
	String x;
	static int y;
	void show() {
		System.out.println(x+" "+y);
	}
	P(){
		System.out.println("Hello P "+x+y);
		x="Ram";
		y++;
	}
}
public class ConstructorQues1 {
	public static void main(String[] args) {
		P p1=new P();
		P p2=new P();
		P p3=new P();
		p1.show();
		p2.show();
		p3.show();
	}
}
