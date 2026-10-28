class Emp{
	String name;
	int salary;
	static String cname="ABC";
	void show() {				
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s) {
		name=n;
		salary=s;
	}
	static void display() {
		System.out.println("Hi Employee");
		System.out.println(cname);
		//System.out.println(name);//error
	}
}
public class StaticMethodEx {
	public static void main(String[] args) {
		Emp.display();
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		
		a.input("Yoyo Gupta", 78000);
		b.input("Teja Khan", 90000 );
		c.input("Kaliya", 6300);
		d.input("Rajnikant", 10000000);

		Emp.display();
		a.display();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		Emp.display();
	}
}