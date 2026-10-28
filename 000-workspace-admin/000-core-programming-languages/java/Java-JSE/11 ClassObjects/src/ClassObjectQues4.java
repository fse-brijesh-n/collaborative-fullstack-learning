public class ClassObjectQues4 {
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ClassObjectQues4 a=new ClassObjectQues4();
		a.x=10;
		a.y="KK";
		ClassObjectQues4 b=new ClassObjectQues4();
		b.y="Ram";
		b.x=90;
		a.show();
		b.show();
	}
}