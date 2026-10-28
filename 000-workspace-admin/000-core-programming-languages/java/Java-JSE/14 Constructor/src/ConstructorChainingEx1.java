class Employee{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Employee(String n,int a){
		this();//constructor chaining statement
		System.out.println("Hello Employee");
		name=n;
		age=a;
	}
	Employee(){
		System.out.println("Hi Employee");
	}
}
public class ConstructorChainingEx1 {
	public static void main(String[] args) {
		Employee a1=new Employee("Gogo",5);
		a1.show();
	}
}
