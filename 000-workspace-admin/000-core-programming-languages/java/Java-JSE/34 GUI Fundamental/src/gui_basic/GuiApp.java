package gui_basic;
import javax.swing.*;
import java.awt.*;

public class GuiApp {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(400, 300);
		f.setTitle("Mera Pehla Frame");
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.YELLOW);
		
		JButton b1=new JButton("Ok");
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.YELLOW);
		b1.setBounds(50,80,60,40);
		f.add(b1);
		JButton b2=new JButton("Ok2");
		b2.setBounds(120,80,60,40);
		f.add(b2);
		JLabel l1=new JLabel("Hello INCAPP");
		l1.setBounds(50,140,80,30);
		f.add(l1);
		JTextField t=new JTextField();
		t.setBounds(50,180,100,30);
		f.add(t);
		
		f.setVisible(true);
	}
}