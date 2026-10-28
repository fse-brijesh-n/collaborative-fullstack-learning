import java.io.*;
public class FileIOEx6 {

	public static void main(String[] args) {
		try {
			//Character Stream
			FileReader f1=new FileReader("abc.txt"); 
			FileWriter f2=new FileWriter("xyz.txt");
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