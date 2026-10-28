public class App2 
{
	public static void main(String[] args) 
	{
		Hello cal=(name)->{
			
			String message="Hello "+name;
			System.out.println(message);
		};
		cal.sayHello("Rakesh");
		cal.sayHello("Danish");
		cal.sayHello("Neha");
		cal.sayHello("David");
	}
}
