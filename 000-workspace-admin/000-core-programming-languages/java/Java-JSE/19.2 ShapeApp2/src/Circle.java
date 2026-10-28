public class Circle extends Shape{  
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
