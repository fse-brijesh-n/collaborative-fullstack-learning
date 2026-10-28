package firstapp;
import javax.swing.*;


 class MyFirstApp extends JFrame{
//3rd method to create GUI using Own class and inheritance --> Recommended
	public MyFirstApp() {
		
		JFrame f=new JFrame("Awt Frame App-3rd method to create GUI using Own class and inheritance --> Recommended");
		f.setLayout(null);
		
		
		JLabel l=new JLabel("Name");
		JTextField tf=new JTextField(20);
		JButton b=new JButton("Ok");
		
		l.setBounds(20, 10, 50, 60);
		tf.setBounds(80, 20, 100, 40);
		b.setBounds(190, 20, 60, 40);
		
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
		
		JFrame f=new JFrame("Awt Frame App-2nd method to create GUI using Own Main class  ");
		f.setLayout(null);
		
		
		JLabel l=new JLabel("Name");
		JTextField tf=new JTextField(20);
		JButton b=new JButton("Ok");
		
		l.setBounds(20, 10, 50, 60);
		tf.setBounds(80, 20, 100, 40);
		b.setBounds(190, 20, 60, 40);
	
		
		f.add(l);
		f.add(tf);
		f.add(b);

		f.setLocation(300,300);
		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		//1st method to create GUI
		JFrame f=new JFrame("Awt Frame App-1st method to create GUI using main method ");
		f.setLayout(null);
		
		
		JLabel l=new JLabel("Name");
		JTextField tf=new JTextField(20);
		JButton b=new JButton("Ok");
		
		l.setBounds(20, 10, 50, 60);
		tf.setBounds(80, 20, 100, 40);
		b.setBounds(190, 20, 60, 40);
		
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
