public class App2 
{
	public static void main(String[] args) 
	{
		Calculator cal=(num1,num2)->{
			int sum=num1+num2;
			return sum;
		};
		int res=cal.add(100,300);
		System.out.println(res);
	}
}
