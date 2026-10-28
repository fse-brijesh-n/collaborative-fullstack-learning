class question2{
	int x;
	static int y;
	question2(){
		System.out.println("Hi A");
	}
	question2(int a){
		x=a;
		System.out.println("Hello A");
	}
	static {
		y=15;
		System.out.println("Class loaded");
	}
	{
		System.out.println("Object created");
	}
}

public class assignQ2 {

	public static void main(String[] args) {
		System.out.println(question2.y);
		question2 e1=new question2();
		question2 e2=new question2(4);
		System.out.println(e1.x);
		System.out.println(e2.x);
		
		

	}

}
/*Class loaded
 * 15
 * Object created
 * Hi A
 * Object created
 * Hello A
 * 0
 * 4
 * 
 * 
 * 
 * 
 * 
 * 
 */
