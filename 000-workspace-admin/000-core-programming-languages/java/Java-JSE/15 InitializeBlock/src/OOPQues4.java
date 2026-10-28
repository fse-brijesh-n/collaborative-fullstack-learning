class P{
	static int x=10;
	String y;
	void show() {
		System.out.println(x+" "+y);
	}
	P(){
		System.out.println("Hi");
		x=15;
	}
	P(String a,int b){
		this();
		System.out.println("OK");
		x+=b;
		y+=a;
	}
	static{
		x++;
		System.out.println("INCAPP");
	}
	{
		x++;
		y="PP";
		System.out.println("Hello");
	}
}
public class OOPQues4 {
	public static void main(String[] args) {
		System.out.println(P.x);
		P m1 = new P();
		P m2 = new P("rahul",12);
		m1.show();
		m2.show();
	}
}