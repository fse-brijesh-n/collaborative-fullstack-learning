import java.util.Scanner;
import java.io.*;
public class FileIOEx3 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			FileOutputStream f=new FileOutputStream("abc.txt"); 
			
			String s;
			do {
				System.out.println("Enter a String:");
				s=sc.nextLine();
				if(!s.equalsIgnoreCase("stop")) {
					byte b[]=s.getBytes();
					f.write(b);
					f.write('\n');
				}
			}while(!s.equalsIgnoreCase("stop"));
			
			sc.close();
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}