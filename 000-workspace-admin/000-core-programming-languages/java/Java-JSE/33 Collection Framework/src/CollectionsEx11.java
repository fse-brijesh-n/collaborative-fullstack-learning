import java.util.*;

public class CollectionsEx11 {

	public static void main(String[] args) {
		//HashMap a=new HashMap();//version-1.2, methods are not synchronized, Iterator allowed(Enumeration not allowed)
		Hashtable a=new Hashtable();//version-1.0, methods are synchronized, Iterator & Enumeration allowed
		a.put("abc",10);
		a.put("xyz","Ram");
		a.put("pqr",7.2);
		a.put("tuv",10);
		a.put(5,12);
		a.put("mno",5);
		System.out.println(a);
		
		Set s=a.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Object o:s) {
			System.out.println(o);
		}
	}

}