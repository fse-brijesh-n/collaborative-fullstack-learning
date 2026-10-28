
public class QuePrinting {

	public static void main(String[] args){
		
		int a=10,b=5;
        System.out.println(a+b+"hi"+a);
		System.out.println(a+b+"hi"+'a');
		System.out.println('a'+b+"hi"+a+'b');
		System.out.println('a'+'b'+"hi"+'a'+'b');
		//System.out.println(a-3+"Hi"+b-2);//error
		System.out.println(a*3+"Hi"+b*2);
		System.out.println(3-b+"Hi"+'a'+3);
		System.out.println(b*a/3-2+"Hi"+b/2);
		System.out.println(a+b);
		System.out.println("sum= "+a+b);
		System.out.println("sum= "+(a+b));
		System.out.println(a/3*b+a-b+"Hello"+a*b/3+'a');
		
	}

}


/*
 * 
 * 15hi10
15hia
102hi10b
195hiab
30Hi10
-2Hia3
14Hi2
15
sum= 105
sum= 15
20Hello16a
*/
 