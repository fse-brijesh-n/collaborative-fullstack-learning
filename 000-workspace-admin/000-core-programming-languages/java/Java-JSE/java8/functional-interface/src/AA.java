@FunctionalInterface
public interface AA 
{
	void method1();
	default void method2()
	{
		System.out.println("It is default method");
	}
}
