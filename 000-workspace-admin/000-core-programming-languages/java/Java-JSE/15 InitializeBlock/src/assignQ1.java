class question1{
	String name;
	question1(){
		System.out.println("Hell0 Emp");
		name="Rahul";
	}
	static {
		System.out.println("Hi Emp");
	}
	{
		System.out.println("I am Emp");
	}
}

public class assignQ1 {

	public static void main(String[] args) {
		question1 e1=new question1();
		question1 e2=new question1();
		System.out.println(e1.name);
		

	}

}
/*
 * hi Emp
 * I am Emp
 * Hello Emp
 * I am Emp
 * Hello Emp
 * Rahul
 * 
 * 
 * 
 */
