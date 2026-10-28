class Vehicle{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Vehicle(String n,int a){
		this("Audi A4");
		System.out.println("Hello Vehicle");
		name=n;
		age=a;
	}
	Vehicle(String n){
		this();
		System.out.println("Ok Vehicle");
		name=n;
	}
	Vehicle(){
		System.out.println("Hi Vehicle");
	}
}
public class ConstructorChainingEx2 {
	public static void main(String[] args) {
		Vehicle v=new Vehicle("BMW x1",10);
		v.show();
	}
}
