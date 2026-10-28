package firstapp;
import java.awt.*;


 class MyFirstApp extends Frame{
//3rd method to create GUI using Own class and inheritance --> Recommended
	public MyFirstApp() {
		
		Frame f=new Frame("Awt Frame App-3rd method to create GUI using Own class and inheritance --> Recommended");
		f.setLayout(new FlowLayout());
		
		
		Label l=new Label("Name");
		TextField tf=new TextField(20);
		Button b=new Button("Ok");
		
		f.add(l);
		f.add(tf);
		f.add(b);

		f.setLocationRelativeTo(null);
		f.setSize(300,300);
		f.setVisible(true);
	}

	
}
public class Application {
//2nd Method to create GUI
	public Application() {
		
		Frame f=new Frame("Awt Frame App-2nd Method to create GUI");
		f.setLayout(new FlowLayout());
		
		
		Label l=new Label("Name");
		TextField tf=new TextField(20);
		Button b=new Button("Ok");
		
		f.add(l);
		f.add(tf);
		f.add(b);

		f.setLocation(300, 300);
		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		//1st method to create GUI
		Frame f=new Frame("Awt Frame App-1st method to create GUI");
		f.setLayout(new FlowLayout());
		
		
		Label l=new Label("Name");
		TextField tf=new TextField(20);
		Button b=new Button("Ok");
		
		f.add(l);
		f.add(tf);
		f.add(b);

		f.setLocation(0, 0);
		f.setSize(300,300);
		f.setVisible(true);
		
		//creating object of another
		new Application();
		new MyFirstApp();
	}

}
