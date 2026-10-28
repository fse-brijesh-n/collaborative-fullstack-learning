class Question2{
	static int x;
	int y;
	Question2(){
		System.out.println("Hello");
		x=20;
		y=10;
	}
	static {
		System.out.println("Hi");
	}
	
}


public class ConstructorQues4 {
	public static void main(String[] args) {
		
		Question2 d1=new Question2();
		Question2 d2=new Question2();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d2.x);
		System.out.println(d2.y);
	}
}
/*for d1
 * hi
 * Hello    x=20,y=10
 * for d2 
 * Hello    x=20,y=10
 * 20
 * 10
 * 20
 * 10
 */
