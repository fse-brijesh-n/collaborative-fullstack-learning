import java.util.Scanner;
import java.io.*;
public class FileIOEx1 {

	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		sc.close();
		byte b[]=s.getBytes();
		
		//Byte Stream
//		FileOutputStream f=new FileOutputStream("D:\\java codes\\abc.txt");
//		FileOutputStream f=new FileOutputStream("abc.txt");//write mode
		FileOutputStream f=new FileOutputStream("abc.txt",true);//append mode
		f.write(b);
		f.write('\n');
		f.close();
		
	}

}