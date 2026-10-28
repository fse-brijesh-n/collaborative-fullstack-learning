class initializedBlock{
	//it will beneficial when there are more than 1 constructors
	{
		System.out.println("2:Initialize block 2");
	}
	{
		System.out.println("2:Initialize block 3");
	}
	initializedBlock(){
		System.out.println("1: Constructor after initialize block");
	}
	{
		System.out.println("2:Initialize block 1");
	}
	
}
public class InitializedBlock {

	public static void main(String[] args) {
		
		System.out.println("When first object is created");
		initializedBlock a=new initializedBlock();
		System.out.println("When second object is created");
		initializedBlock b=new initializedBlock();
		System.out.print("......");
		System.out.println("When n object is created");
		initializedBlock c=new initializedBlock();
	}

}
