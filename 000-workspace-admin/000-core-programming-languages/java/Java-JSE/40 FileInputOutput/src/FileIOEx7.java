import java.io.*;
public class FileIOEx7 {

	public static void main(String[] args) {
		try {
			//Byte Stream
			FileInputStream f1=new FileInputStream("abc.txt"); 
			FileOutputStream f2=new FileOutputStream("pqr.txt");
			int a;
			while((a=f1.read()) != -1) {
				f2.write((char)a);
			}
			f1.close();
			f2.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}