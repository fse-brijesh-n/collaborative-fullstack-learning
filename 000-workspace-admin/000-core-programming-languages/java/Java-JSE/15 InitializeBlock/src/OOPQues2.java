class Abc{
	int x=10;
	static String y;
	{
		System.out.println("Hello");
	}
	void show() {
		System.out.println(x+" "+y);
	}
	Abc(){
		this("kk",90);
		System.out.println("Hi");
		x=15;
	}
	Abc(String a,int b){
		System.out.println("OK");
		x=b;
		y=a;
	}
	static{
		System.out.println("INCAPP");
	}
}
public class OOPQues2 {
	public static void main(String[] args) {
		System.out.println(Abc.y);
		Abc m1 = new Abc();
		Abc m2 = new Abc("rahul",12);
		m1.show();
		m2.show();
	}
}