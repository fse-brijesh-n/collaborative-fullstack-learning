import java.util.*;

public class CollectionsEx10 {

	public static void main(String[] args) {
		//HashMap a=new HashMap();//stores buckets or entry randomly
		LinkedHashMap a=new LinkedHashMap();//subclass of HashMap :stores buckets or entry with sequence
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