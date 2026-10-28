import java.io.*;
import java.util.Scanner;
public class FileIOEx10 {

	public static void main(String[] args) throws IOException {
//		try with resource (introduced in Java 8)
		try(FileInputStream f=new FileInputStream("abc.txt")) {
			int a;
			while((a=f.read()) != -1) {
				System.out.print((char)a);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
//		try without resource
		
//		FileInputStream f=null;
//		try {
//			f=new FileInputStream("D:\\JavaCodes\\abc.txt"); 
//			int a;
//			while((a=f.read()) != -1) {
//				System.out.print((char)a);
//			}
//		}catch (Exception e) {
//			System.out.println(e);
//		}finally {
//			f.close();
//		}
	}

}