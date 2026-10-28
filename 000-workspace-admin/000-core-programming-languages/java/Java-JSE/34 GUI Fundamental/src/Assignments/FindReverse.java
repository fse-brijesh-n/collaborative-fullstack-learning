package Assignments;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FindReverse extends JFrame {
		private static final long serialVersionUID = 1L;
		private JPanel p;
		private JLabel num1, ans;
		private JTextField t;
		private JButton rev;
		String value;
		int  rev_value;
		class A implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				value=t.getText();
				int n=Integer.parseInt(value);
				rev_value=0;
				while(n>0) {
					int rem;
					rem=n%10;
					rev_value=rev_value*10+rem;
					n=n/10;
				}
				ans.setText(""+rev_value);
				
			}
			
		}
	FindReverse(){
		
		new JFrame();
		setSize(300,200);
		setTitle("Find Reverse");
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		Font f1=new Font(Font.MONOSPACED,Font.BOLD,14);
		Font f2=new Font(Font.SANS_SERIF,Font.BOLD,10);
		
		
		p=new JPanel();
		add(p);
		p.setLayout(null);
		p.setBounds(40,20,220,120);
		p.setBackground(Color.ORANGE);
		
		num1=new JLabel("Enter a Number: ");
		p.add(num1);
		num1.setBounds(20,20,120,20);
		num1.setFont(f1);
		
		t=new JTextField(50);
		p.add(t);
		t.setBounds(140,20,60,20);
		
		rev=new JButton("Reverse");
		p.add(rev);
		rev.setBounds(20,80,120,20);
		num1.setFont(f2);
		rev.addActionListener(new A());
		
		ans=new JLabel(""+rev_value);
		p.add(ans);
		ans.setBounds(160,80,120,20);
		
	}
}
