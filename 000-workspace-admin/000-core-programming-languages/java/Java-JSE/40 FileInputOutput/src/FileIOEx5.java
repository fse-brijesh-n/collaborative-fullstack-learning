import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class FileIOEx5 {

	public static void main(String[] args) {
//		read data from file character by character
		try {
			//Character Stream
			FileReader f=new FileReader("abc.txt"); 
			int a;
			while((a=f.read()) != -1) {
				System.out.print((char)a);
			}
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println();
		
//		read data from file using scanner class line by line
		try {
			//Character Stream
			FileReader f=new FileReader("abc.txt");  
			Scanner sc=new Scanner(f);
			while(true) {
				try {
					String s=sc.nextLine();
					System.out.println(s);
				}catch (NoSuchElementException e) {
					f.close();
					break;
				}
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}