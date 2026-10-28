class Person{
	{
		System.out.println("INCAPP");
	}
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Person(){
		System.out.println("Hello Person");
		name="Ram";
		age=10;
	}
	{
		System.out.println("OK");
	}
}
public class InitializeBlockEx1 {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		p1.show();
		p2.show();
		p3.show();
	}
}