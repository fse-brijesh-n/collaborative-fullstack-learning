class Xyz{
	double x;
	static int y=12;
	void show() {
		System.out.println(x+" "+y);
	}
	Xyz(){
		this(3);
		System.out.println("Hi");
		x=15;
	}
	Xyz(double a){
		System.out.println("OK");
		x+=a;
		y++;
	}
	static{
		System.out.println("INCAPP");
	}
	{
		System.out.println("Hello");
	}
}
public class OOPQues3 {
	public static void main(String[] args) {
		Xyz m1 = new Xyz();
		Xyz m2 = new Xyz(1.2);
		m1.show();
		m2.show();
	}
}
