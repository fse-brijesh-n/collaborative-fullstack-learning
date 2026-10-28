class Employee{
	String name;
	int salary;
	static String cname="ABC";
	void show(){
		System.out.println(name+" "+salary+" "+cname);
	}
	public void input(String n,int s) {
		name=n;
		salary=s;
	}
}
public class StaticVariableEx {
	public static void main(String[] args) {
		//System.out.println(cname);//error
		System.out.println(Employee.cname);
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		
		a.input("Cheetah Khan",256000);
		b.input("Yoyo Gupta",125000);
		c.input("Gogo Singh",98000);
		d.input("Teja Seth",780000);

		a.cname="XYZ";
		
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}