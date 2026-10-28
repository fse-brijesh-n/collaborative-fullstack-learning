
public class Triangle extends Shape{

private double a;
	@Override
	public void findArea() {
		a=8.1*6.4/2;
		//super.findArea();
	}

	@Override
	public void printArea() {
		System.out.println("Area of triangle: "+a);
		//super.printArea();
	}

}
