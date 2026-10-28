
class M{
	int x=90;
	String y="Ram";
	void show() {
		x++;
		System.out.println(x+y);
	}
}
public class ClassObjectQues5 {
	public static void main(String[] args) {
		M m1=new M();
		M m2=new M();
		m1.show();
		m1.show();
		m2.show();
	}
}