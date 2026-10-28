// Acheived run time polymorphism using only  Abstract methods that have no body
public class ShapeApp {//extends Shape

//	@Override
//	void findArea() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	void printArea() {
//		// TODO Auto-generated method stub
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
//		//s=new Shape(); //can't create object of an absstract class
//		s.findArea();
//		s.printArea();
		System.out.println("************************************");
		s=new Circle();
		s.findArea();
		s.printArea();
		System.out.println("************************************");
		s=new Ractangle();
		s.findArea();
		s.printArea();
		System.out.println("************************************");
		s=new Triangle();
		s.findArea();
		s.printArea();
		System.out.println("************************************");
		
		System.out.println("Or");
		
		System.out.println("************************************");
		Shape s1=new Circle();
		s1.findArea();
		s1.printArea();
		System.out.println("************************************");
		Shape s2=new Ractangle();
		s2.findArea();
		s2.printArea();
		System.out.println("************************************");
		Shape s3=new Triangle();
		s3.findArea();
		s3.printArea();
		System.out.println("************************************");

	}

}
