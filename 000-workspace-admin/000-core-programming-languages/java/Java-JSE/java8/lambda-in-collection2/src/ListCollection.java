import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListCollection 
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
		
		//Display details of each person
		/*class ConsumerImpl implements Consumer<Person>
		{
			public void accept(Person person) 
			{
				System.out.println(person);
			}
			
		}
		list.forEach(new ConsumerImpl());*/
		list.forEach((person)->System.out.println(person));
		//list.forEach(System.out::println);
	}
}
