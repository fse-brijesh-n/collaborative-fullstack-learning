import java.util.*;

public class CollectionsEx15 {

	public static void main(String[] args) {
		
		int a[]= {2,75,4,58,14,4};
		
		//Array to Collection
		ArrayList<Integer> al=new ArrayList() ;
		for(int x:a) {
			al.add(x);
		}
		System.out.println(al);
		
		HashSet<Integer> hs=new HashSet() ;
		for(int x:a) {
			hs.add(x);
		}
		System.out.println(hs);
		
		//Collection to Array
		int size=al.size(); //int size=hs.size();
		int b[]=new int[size];
		int i=0;
		for(int x:al) { // for(int x:hs) {
			b[i++]=x;
		}
		System.out.println(Arrays.toString(b));
		
	}

}