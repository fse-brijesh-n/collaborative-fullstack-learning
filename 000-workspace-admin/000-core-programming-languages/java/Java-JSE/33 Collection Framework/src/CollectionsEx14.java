import java.util.*;

public class CollectionsEx14 {

	public static void main(String[] args) {
		//non-generic collection
		ArrayList a=new ArrayList();
		a.add(15);
		a.add("ram");//allowed
		a.add(78);
		a.add(5.6);
		System.out.println(a);
		Integer x=(Integer)a.get(0);
		System.out.println(x);
		for(Object o:a)
			System.out.println(o);
		
		//generic collection
		ArrayList<Integer> al=new ArrayList();//allowed
		//ArrayList<int> al=new ArrayList();//error
		//ArrayList<Integer> al=new ArrayList<Integer>();//allowed
		//ArrayList al=new ArrayList<Integer>(); //Not Generic Collection
		//ArrayList<Integer> al=new ArrayList<>();//allowed - more recommended
		//ArrayList<> al=new ArrayList<Integer>();//error
//		List<Integer> al=new ArrayList<>();//allowed
		al.add(15);
		//al.add("ram");//error
		al.add(78);
		al.add(56);
		System.out.println(al);
		Integer y=al.get(0);
		for(Integer o:al)
			System.out.println(o);
		
		
		//generic collection for Map
		HashMap<String,Integer> h=new HashMap<>();
		h.put("abc", 25);
		h.put("xyz", 56);
		//h.put(1, 25);//error
		//h.put("abc", 2.5);//error
		System.out.println(h);
	}

}