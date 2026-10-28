class Human{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Human(String n,int a){
		System.out.println("Hello Human");
		name=n;
		age=a;
	}
	Human(){
		System.out.println("Hi Human");
	}
	{
		System.out.println("INCAPP");
	}
}
public class InitializeBlockEx2 {
	public static void main(String[] args) {
		Human p1=new Human("Gogo",45);
		Human p2=new Human();
		Human p3=new Human("Jojo",12);
		p1.show();
		p2.show();
		p3.show();
	}
}