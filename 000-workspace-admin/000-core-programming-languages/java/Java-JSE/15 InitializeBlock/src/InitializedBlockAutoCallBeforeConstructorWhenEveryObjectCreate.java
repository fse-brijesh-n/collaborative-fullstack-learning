class initializedBlock1{
	
	initializedBlock1(){
		System.out.println("1: Constructor after initialize block");
	}
	{
		System.out.println("2: Anonynimous block Initialized block calling automatically after Static block(at loading) and calling before Constructor");
	}
}
public class InitializedBlockAutoCallBeforeConstructorWhenEveryObjectCreate {

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
