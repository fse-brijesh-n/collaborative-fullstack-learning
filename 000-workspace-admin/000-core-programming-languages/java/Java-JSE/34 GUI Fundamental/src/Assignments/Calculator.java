package Assignments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,ans,ans_value,error;
	JTextField f1,f2;
	JButton b1,b2,b3,b4,b5;
	String num1,num2,err;
	double result;
	int mod;
	
	class Add implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				num1=f1.getText();
				num2=f2.getText();
			}catch(Exception e1) {
				e1.getMessage();
				
			}
			
			double a=Double.parseDouble(num1);
			double b=Double.parseDouble(num2);
			result=a+b;
			ans_value.setText(""+a+"+"+b+"="+result);
			
		}
		
	}
	class Sub implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				num1=f1.getText();
				num2=f2.getText();
			}catch(Exception e1) {
				e1.getMessage();
			}
			double a=Double.parseDouble(num1);
			double b=Double.parseDouble(num2);
			result=a-b;
			ans_value.setText(""+a+"-"+b+"="+result);
		}
		
	}
	
	class Mul implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				num1=f1.getText();
				num2=f2.getText();
			}catch(Exception e1) {
				e1.getMessage();
			}
			double a=Double.parseDouble(num1);
			double b=Double.parseDouble(num2);
			result=a*b;
		
			ans_value.setText(""+a+"*"+b+"="+result);
		}
		
	}
	
	class Div implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				num1=f1.getText();
				num2=f2.getText();
			}catch(Exception e1) {
				e1.getMessage();
			}
			double a=Double.parseDouble(num1);
			double b=Double.parseDouble(num2);
//			double s=result=a/b;//upcasting
			try {
				result=a/b;
			}catch(Exception e2) {
				e2.getMessage();
			}
			ans_value.setText(""+a+"/"+b+"="+result);
		}
		
	}
	
	class Mod implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				num1=f1.getText();
				num2=f2.getText();
			}catch(Exception e1) {
				e1.getMessage();
			}
			double a=Double.parseDouble(num1);
			double b=Double.parseDouble(num2);
			try {
				
				result=a%b;
				mod=(int)result;
			}catch(Exception e2) {
				e2.getMessage();
			}
			
			ans_value.setText(""+a+"%"+b+"="+mod);
		}
		
	}
	Calculator(){
			

		super("Caluclator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,400);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		setLocationRelativeTo(null);
		setVisible(true);
		
		l1=new JLabel("Number1:");
		l1.setBounds(200,100, 180, 20);
		add(l1);
		
		f1=new JTextField();
		f1.setBounds(310, 100, 180, 20);
		add(f1);
		
		l2=new JLabel("Number2:");
		l2.setBounds(200, 140, 180, 20);
		add(l2);
		
		f2=new JTextField();
		f2.setBounds(310, 140, 180, 20);
		add(f2);
		
		b1=new JButton("+");
		b1.setBounds(200, 180, 50, 50);
		add(b1);
		b1.addActionListener(new Add());
		
		
		b2=new JButton("-");
		b2.setBounds(260, 180, 50, 50);
		add(b2);
		b2.addActionListener(new Sub());
		
		b3=new JButton("x");
		b3.setBounds(320, 180, 50, 50);
		add(b3);
		b3.addActionListener(new Mul());
		
		b4=new JButton("/");
		b4.setBounds(380, 180, 50, 50);
		add(b4);
		b4.addActionListener(new Div());
		
		b5=new JButton("%");
		b5.setBounds(440, 180, 50, 50);
		add(b5);
		b5.addActionListener(new Mod());
		
		ans=new JLabel("Answer:");
		ans.setBounds(200,240, 100, 20);
		add(ans);
		
		ans_value=new JLabel(""+result);
		ans_value.setBounds(410,240, 160, 20);
		add(ans_value);
		
	
		
		
	}
}
