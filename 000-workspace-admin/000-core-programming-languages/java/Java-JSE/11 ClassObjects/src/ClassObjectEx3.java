class Employeee{
	private String name;
	private int salary=9000;
	private String cname;
	public void show(){
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s,String c) {
		name=n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectEx3 {
	public static void main(String[] args) {
		Employeee a=new Employeee();
		Employeee b=new Employeee();
		Employeee c=new Employeee();
		Employeee d=new Employeee();
		
		
		a.input("Cheetah Khan",256000,"ABC");
		b.input("Yoyo Gupta",125000,"XYZ");
		c.input("Gogo Singh",98000,"MNO");
		d.input("Teja Seth",780000,"PQR");

//		.name="Kaliya";//error
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		//int total=a.salary+b.salary+c.salary+d.salary;//error
	}
}
