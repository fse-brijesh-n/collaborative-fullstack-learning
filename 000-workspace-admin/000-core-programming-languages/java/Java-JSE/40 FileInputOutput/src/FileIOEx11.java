import java.io.*;
import java.util.Scanner;
public class FileIOEx11 {

	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("abc.txt");
			PrintStream p=new PrintStream(f);
			
			String s="hello INCAPP";
			p.println(s);
			System.out.println(s);
			System.setOut(p);
			System.out.println(s);
			System.out.println(78);
			p.close();
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}