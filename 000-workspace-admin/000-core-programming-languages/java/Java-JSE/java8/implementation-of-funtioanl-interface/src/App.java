public class App 
{
	public static void main(String[] args) 
	{
		//Write command to invoke square() method of interface Calculator
		class CalculatorImpl implements Calculator
		{
			public void square(int num)
			{
				int sq=num*num;
				System.out.println(sq);
			}
		}
		Calculator cal=new CalculatorImpl();
		cal.square(80);
	}
}
