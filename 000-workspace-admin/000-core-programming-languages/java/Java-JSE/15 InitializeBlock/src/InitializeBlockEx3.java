class Animal{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Animal(String n,int a){
		this();
		System.out.println("Hello Animal");
		name=n;
		age=a;
	}
	Animal(){
		System.out.println("Hi Animal");
	}
	{
		System.out.println("INCAPP");
	}
}
public class InitializeBlockEx3 {
	public static void main(String[] args) {
		Animal p1=new Animal("Gogo",45);
		p1.show();
	}
}