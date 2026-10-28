
public class ClassObjectEx1 {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();//Object creation and memory allocation to the variable emp1 which is type of Employee
		Employee emp2=new Employee();//Object creation and memory allocation to the variable emp2 which is type of Employee
		Employee emp3=new Employee();//Object creation and memory allocation to the variable emp3 which is type of Employee
		Employee emp4=new Employee();//Object creation and memory allocation to the variable emp4 which is type of Employee
		
		System.out.println(emp1); 
		
		emp1.name="Brijesh";
		emp1.salary=7000000;
		emp1.cname="Tecresearch";
		
		emp2.name="Kishan";
		emp2.salary=7000000;
		emp2.cname="Tecresearch";
		
		emp3.name="Ritik";
		emp3.salary=7000000;
		emp3.cname="Tecresearch";
		
		emp4.name="Ashutosh";
		emp4.salary=7000000;
		emp4.cname="Tecresearch";
		
		System.out.println(emp1.name+"  "+emp1.salary+"   "+emp1.cname);
		System.out.println(emp2.name+"  "+emp2.salary+"   "+emp2.cname);
		System.out.println(emp3.name+"  "+emp3.salary+"   "+emp3.cname);
		System.out.println(emp4.name+"  "+emp4.salary+"   "+emp4.cname);
	}

}
class Employee{
	
	String name;
	int salary;
	String cname; 
	
}