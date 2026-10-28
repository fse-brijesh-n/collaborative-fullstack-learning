import java.util.*;

public class CollectionsEx12 {

	public static void main(String[] args) {
		TreeMap a=new TreeMap();//Sort the Buckets or Entries a/c to keys
		a.put("abc",10);
		a.put("xyz","Ram");
		a.put("pqr",7.2);
		//a.put(1,7.2); // ClassCastException Occurred
		a.put("tuv",10);
		a.put("ghi",12);
		a.put("mno",5);
		System.out.println(a);
		
		Set s=a.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		a=new TreeMap();
		a.put(34,10);
		a.put(78,"Ram");
		a.put(98,7.2);
		//a.put("abc",7.2); // ClassCastException Occurred
		a.put(23,10);
		a.put(56,12);
		a.put(31,5);
		System.out.println(a);
	}

}