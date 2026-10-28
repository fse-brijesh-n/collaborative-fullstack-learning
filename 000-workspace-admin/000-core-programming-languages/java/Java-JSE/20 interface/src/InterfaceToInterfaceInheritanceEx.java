interface Human{
	void eat();
}
interface Student extends Human{
	void study();
}
class SchoolStudent implements Student{

//	@Override
//	public void eat() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void study() {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void study() {
		System.out.println("School Student Study");
	}
	@Override
	public void eat() {
		System.out.println("School Student Eat");
	}
	public void kuchbhi() {
		System.out.println("Kuch bhiiiii");
	}
}
public class InterfaceToInterfaceInheritanceEx {
	public static void main(String[] args) {
		SchoolStudent s=new SchoolStudent();
		s.eat();
		s.study();
		s.kuchbhi();
		Student s1=new SchoolStudent();
		s1.eat();
		s1.study();
		//s1.kuchbhi();//error
		Human h=new SchoolStudent();
		h.eat();
		//h.study();//error
		//h.kuchbhi();//error
	}
}