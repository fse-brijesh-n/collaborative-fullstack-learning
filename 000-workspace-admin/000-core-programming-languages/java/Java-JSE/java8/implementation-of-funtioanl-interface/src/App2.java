public class App2 
{
	public static void main(String[] args) 
	{
		//Write command to invoke square() method of interface Calculator
		Calculator cal=new Calculator() 
		{
			public void square(int arg)
			{
				int sq=arg*arg;
				System.out.println(sq);
			}
		};
		cal.square(134);
	}
}
