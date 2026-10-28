public class App 
{
	public static void main(String[] args) 
	{
		//Write command to invoke square() method of interface Calculator
		Calculator cal=(arg)->System.out.println(arg*arg);
		cal.square(70);
		cal.square(10);
		cal.square(234);
	}
}
