class AssignIheritanceQ2{
	int x;
	AssignIheritanceQ2(){
		this(2);
		System.out.println("Hi A");
	}
	AssignIheritanceQ2(int a){
		x=a;
		System.out.println("Hello A");
	}
}
class Child2 extends AssignIheritanceQ2{
	
	Child2(){
		System.out.println("Hi B");
	}

}
public class Assignments2 {

	public static void main(String[] args) {
		
		Child2 b=new Child2();
		System.out.println(b.x);
		

	}

}
/*
 *Helo A
 *Hi A
 *Hi B
 *2
 * 
 */
