package Assignments;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleInterest extends JFrame{
	JPanel p1,p2;
	JLabel l1,l2,l3,ans,ans1;
	JTextField printcipal,rate,time;
	double p,r,t,result;
	JButton find;
	
	class Si implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			p=Double.parseDouble(printcipal.getText());
			r=Double.parseDouble(rate.getText());
			t=Double.parseDouble(time.getText());
			result=(p*r*t)/100;
			ans1.setText(""+result);
			
		}
		
	}
	
	SimpleInterest(){
		
		new JFrame();
		setTitle("Simple Interest");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);
		
		Font font1=new Font(Font.SANS_SERIF,Font.BOLD,14);
		Font font2=new Font(Font.MONOSPACED,Font.BOLD,10);
		
		p1=new JPanel();
		add(p1);
		p1.setBounds(50,50,300,200);
		p1.setBackground(Color.pink);
		p1.setLayout(null);
		
		l1=new JLabel("Principle",10);
		p1.add(l1);
		l1.setBounds(20,20,70,20);
		l1.setFont(font1);
		
		printcipal=new JTextField(200);
		p1.add(printcipal);
		printcipal.setBounds(90,20,150,20);
		
		l2=new JLabel("Rate");
		p1.add(l2);
		l2.setBounds(20,60,70,20);
		l2.setFont(font1);
		
		rate=new JTextField(200);
		p1.add(rate);
		rate.setBounds(90,60,150,20);
		
		l3=new JLabel("Time");
		p1.add(l3);
		l3.setBounds(20,100,70,20);
		l3.setFont(font1);
		
		time=new JTextField(200);
		p1.add(time);
		time.setBounds(90,100,150,20);
		
		find=new JButton("Find");
		p1.add(find);
		find.setBounds(130, 150, 60, 30);
		find.setFont(font2);
		find.addActionListener(new Si());
		
		p2=new JPanel();
		add(p2);
		p2.setBounds(50,300,300,50);
		p2.setBackground(Color.green);
		p2.setLayout(null);
		
		ans=new JLabel("Answer:");
		p2.add(ans);
		ans.setBounds(20,15,70,20);
		ans.setFont(font1);
		
		ans1=new JLabel(""+result);
		p2.add(ans1);
		ans1.setBounds(150,15,120,20);
		ans1.setFont(font1);
			
		
		
	}
	
}
