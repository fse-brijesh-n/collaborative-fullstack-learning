import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListCollection2 
{
	public static void main(String[] args) 
	{
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Rahul",24));
		list.add(new Person("Imran",21));
		list.add(new Person("David",29));
		list.add(new Person("Ramesh",50));
		list.add(new Person("Suman",24));
		list.add(new Person("Amit",22));
		list.add(new Person("Atul",21));
		
		//Display details of each person in the ascending order of age
		//Invoke sort method of Collections class and in this method pass
		//1:collection reference
		//2:Implementation of Comparator interface
		class ComparatorImpl implements Comparator<Person>
		{
			public int compare(Person p1, Person p2) 
			{
				int c=p1.getAge()-p2.getAge();
				return c;
			}
		}
		Collections.sort(list,new ComparatorImpl());
		for(Person person:list)
		{
			System.out.println(person);
		}
	}
}
