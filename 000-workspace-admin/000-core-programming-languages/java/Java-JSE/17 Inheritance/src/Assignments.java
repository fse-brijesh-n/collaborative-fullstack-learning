class AssignIheritanceQ1{
	int x;
	AssignIheritanceQ1(){
		System.out.println("Hi A");
		x=10;
	}
}
class Child extends AssignIheritanceQ1{
	int y;
	Child(){
		System.out.println("Hello child");
		x=15;
	}
	void show() {
		System.out.println(x);
		System.out.println(y);
	}
}
public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child b=new Child();
		b.show();

	}

}
/*
 * Hi A
 * Hello child
 * 15
 * 0
 * 
 */
