import java.util.Scanner;
import java.io.*;
public class FileIOEx2 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		sc.close();
		char c[]=s.toCharArray();
		
		//Character Stream
		FileWriter f=new FileWriter("abc.txt"); //write mode
		//FileWriter f=new FileWriter("abc.txt",true); //append mode
		f.write(c);
		//f.write(s);//allowed
		f.close();
		
	}

}