package exceptional_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingEx15 {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D:\\io.pdf");
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}