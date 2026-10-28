import java.io.*;
import java.util.Scanner;
public class FileIOEx8 {

	public static void main(String[] args) {
		try {
			//Byte Stream
			FileOutputStream f=new FileOutputStream("abc.txt");
			PrintStream p=new PrintStream(f);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String:");
			String s=sc.nextLine();
			p.println(s);
			System.out.println("Enter a Double:");
			double a=sc.nextDouble();
			p.println(a);
			
			sc.close();
			p.close();
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}