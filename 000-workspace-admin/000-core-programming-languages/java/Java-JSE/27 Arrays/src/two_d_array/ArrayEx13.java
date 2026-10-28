package two_d_array;
public class ArrayEx13 {
	public static void main(String[] args) {
		//int a[]=new int[];//CompileTime Error 
		int a[]=new int[0];//allowed
		int aa[]=new int[-1];//Not allowed [ NegativeArraySizeException ]
		//int aaa[]=new int[2.0];//CompileTime Error [ only int,byte,short,char allowed ]
		//int aaa[]=new int[2L];//CompileTime Error 
		int d[]=new int['a'];//allowed 'a'->97
		int aaa[]=new int[7/2];//allowed
		int aaaa[]=new int[-(-2)];//allowed
		//int b[]=new byte[3];//CompileTime Error
		Object o=new int[3];//allowed
		int b[]=new int[100];
		//System.out.println(b[1.0]);//CompileTime Error [ only int,byte,short,char allowed ]
		System.out.println(b[-2]);//Not allowed [ ArrayIndexOutOfBoundsException ]
		System.out.println(b[7/2]);//allowed
		System.out.println(b['a']);//allowed 'a'->97
		
	}
}
