//Allowed final variable with blank
class Test{
	final int a;//solve by constructor
	Test(){
		a=10;
	}
}

class Test1{
	final int a;
	{
		a=10;
	}
}

class Test2{
	static final int a;
	static{
		a=10;
	}
}

//Not Allowed final variable with blank

//class Test11{
//	final int a;//solve by constructor
//	Test11(){
//		a=10;
//	}
//	{
//		a=10;
//	}
//}

//class Test22{
//	static final int a;
//	Test22{
//		a=10;
//	}
//}

//class Test33{
//	 final int a;
//	static{
//		a=10;
//	}
//}

public class BlankFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
