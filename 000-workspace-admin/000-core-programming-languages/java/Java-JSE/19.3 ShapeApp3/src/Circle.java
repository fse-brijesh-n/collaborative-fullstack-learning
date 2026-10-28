//here I want to get multiple inheritace of A class but by confliction of members no possible  its possible in interface
public class Circle implements Shape{  
//	//now overriding the methods
//public	void findArea() {
//		
//	}
//public	void printArea() {
//		
//	}
	private double a;
	@Override
	public void findArea() {
		
		a=3.14*5*5;
		//super.findArea();
	}

	@Override
	public void printArea() {
		System.out.println("Area of circle:"+a);
		//super.printArea();
	}
	



}
