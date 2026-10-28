package one_d_array;
public class ArrayEx2 {
	public static void main(String[] args) {
//		int []a=new int[4]; //allowed			
//		a[0]=8;					
//		a[1]=9;
//		a[2]=10;
//		a[3]=5;
		
//		int a[];
//		a=new int[] {4,24,45,5};//allowed
//		a=new int[4] {4,24,45,5};//error
//		a= {4,24,45,5};//error
		
//		int a[]=new int[]{8,3,10,5};//allowed
		int a[]={8,3,10,5};//now, new int[] is skip able 
		
		for(int x:a)
			System.out.println(x);
	}
}
