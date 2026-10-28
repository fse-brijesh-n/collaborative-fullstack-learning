
class ques4{
	int x = 10;

	ques4() {
		System.out.println("Hi A");
	}

	ques4(int a) {
		this();
		System.out.println("Hello A");
		x = a;
	}
}

class Child4 extends ques4 {
	int y;

	Child4() {
		super(5);
		System.out.println("Hi B");
	}

	Child4(int b) {
		x = y = b;
		System.out.println("Hello B");
	}
}

public class Assignments4 {

	public static void main(String[] args) {

		Child4 b = new Child4();
		Child4 b2 = new Child4(5);
		System.out.println(b.x + "\t" + b.y);
		System.out.println(b2.x + "\t" + b2.y);

	}

}

/*
 * 

 * Hi A 
 * Hello A
 * Hi B
 * Hi A
 * Hello B
 * 5	0
 * 5	5
 * 
 * */
