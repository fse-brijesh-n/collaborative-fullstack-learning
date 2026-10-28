
public class StaticKeyword1 {

	public static void main(String[] args) {//JVM load class once when loading its firstly load static member 
		 	//static variable
		//System.out.println(cname);
		System.out.println(Employees.cname);

	}

}

class Employees{
	//Instance name or non-static member
	String name;
	int salary;
	//Class member which is direct call by the class name and object reference both
	static String cname="Tecresearch";//static variable allocated in the memory when class loaded
	
}
