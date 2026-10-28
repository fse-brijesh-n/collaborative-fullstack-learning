public class App 
{
	public static void main(String[] args) 
	{
		Calculator cal=(num1,num2)->num1+num2;
		int res=cal.add(500,300);
		System.out.println(res);
	}
}
