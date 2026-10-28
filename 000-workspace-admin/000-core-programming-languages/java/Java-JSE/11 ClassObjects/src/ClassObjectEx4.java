class Employeeee{
	private String name;
	private long salary;
	private String cname;
	public void show(){
		System.out.println(name+" "+salary+" "+cname);
	}
	void input() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Employee's Details:");
		System.out.print("Name: ");
		name=sc.next();
		System.out.print("Salary: ");
		salary=sc.nextLong();
		System.out.print("Company Name: ");
		cname=sc.next();
		 
	}
}
public class ClassObjectEx4 {
	public static void main(String[] args) {
		Employeeee a=new Employeeee();
		Employeeee b=new Employeeee();
		Employeeee c=new Employeeee();
		Employeeee d=new Employeeee();
		
		a.input();
		b.input();
		c.input();
		d.input();

		a.show();
		b.show();
		c.show();
		d.show();
		
	}
}
