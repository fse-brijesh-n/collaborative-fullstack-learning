import java.io.*;
import java.util.Scanner;
public class FileIOEx9 {

	public static void main(String[] args) {
		try {
			//Character Stream
			FileWriter f=new FileWriter("abc.txt");
			PrintWriter p=new PrintWriter(f);
			
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