class My{
	static int x=10;
	String y;
	void show() {
		System.out.println(x+" "+y);
	}
	My(){
		System.out.println("Hi");
		x=15;
	}
	My(String a,int b){
		this();
		System.out.println("OK");
		x=b;
		y=a;
	}
	static{
		System.out.println("INCAPP");
	}
	{
		System.out.println("Hello");
	}
}
public class OOPQues1 {
	public static void main(String[] args) {
		System.out.println(My.x);
		My m1 = new My();
		My m2 = new My("rahul",12);
		m1.show();
		m2.show();
	}
}