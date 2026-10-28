class AA{
	String x;
	static int y;
	void show() {
		System.out.println(x+" "+y);
	}
	AA(){
		System.out.println("Hello AA");
		x="Ram";
		y++;
	}
	static {
		System.out.println("Hi AA");
	}
}
public class ConstructorQues2 {
	public static void main(String[] args) {
		System.out.println(AA.y);
		AA a1=new AA();
		AA a2=new AA();
		a1.show();
		a2.show();
	}
}
