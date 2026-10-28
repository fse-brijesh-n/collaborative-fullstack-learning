package gui_basic;
import javax.swing.*;
import java.awt.*;




public class Login extends Registration{

	   Login() {
		
		JFrame f=new JFrame();
		f.setSize(600,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setTitle("My First Software");
		f.setLayout(null);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		
		JLabel l=new JLabel("Users Login");
		l.setBounds(130, 10, 100, 10);
		l.setForeground(Color.WHITE);
		f.add(l);
		

		JLabel l2=new JLabel("Email:");
		l2.setBounds(50, 80, 100, 10);
		l2.setForeground(Color.WHITE);
		f.add(l2);
		
		JTextField t2=new JTextField();
		t2.setBounds(160,80,160,20);
		f.add(t2);
		
		JLabel l3=new JLabel("Password:");
		l3.setBounds(50, 120, 100, 10);
		l3.setForeground(Color.WHITE);
		f.add(l3);
		
		JTextField t3=new JTextField();
		t3.setBounds(160,120,160,20);
		f.add(t3);
		
		
		JButton b2=new JButton("Login");
		b2.setBackground(Color.orange);
		b2.setForeground(Color.darkGray);
		b2.setBounds(190,160,130,40);
		f.add(b2);
		
		
		

	}

}
