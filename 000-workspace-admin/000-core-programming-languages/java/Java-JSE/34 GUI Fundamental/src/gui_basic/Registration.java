package gui_basic;
import javax.swing.*;
import java.awt.*;




public class Registration {

	Registration() {
		
		JFrame f=new JFrame();
		f.setSize(600,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		f.setLocationRelativeTo(null);
		f.setTitle("My First Software");
		f.setLayout(null);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		
		JLabel l=new JLabel("Users Details");
		l.setBounds(130, 10, 100, 10);
		l.setForeground(Color.WHITE);
		f.add(l);
		
		JLabel l1=new JLabel("Name:");
		l1.setBounds(50, 40, 100, 10);
		l1.setForeground(Color.WHITE);
		f.add(l1);
		
		JTextField t1=new JTextField();
		t1.setBounds(160,40,160,20);
		f.add(t1);
		
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
		
		JLabel l4=new JLabel("Phone:");
		l4.setBounds(50, 160, 100, 10);
		l4.setForeground(Color.WHITE);
		f.add(l4);
		
		JTextField t4=new JTextField();
		t4.setBounds(160,160,160,20);
		f.add(t4);
		
		JLabel l5=new JLabel("Address:");
		l5.setBounds(50, 200, 100, 10);
		l5.setForeground(Color.WHITE);
		f.add(l5);
		
		JTextField t5=new JTextField();
		t5.setBounds(160,200,160,20);
		f.add(t5);
		
		JButton b1=new JButton("Registration");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.darkGray);
		b1.setBounds(190,240,130,40);
		f.add(b1);
			
		

	}

}
