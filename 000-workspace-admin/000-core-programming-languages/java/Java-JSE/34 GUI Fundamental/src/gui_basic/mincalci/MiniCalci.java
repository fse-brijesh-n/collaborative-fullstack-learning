package gui_basic.mincalci;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Gui extends JFrame{
	private JButton b1,b2,b3,b4,b5;
	private JLabel l1,l2,l3,l4;
	private JTextField t1,t2;
	private JPanel p;
	
	class A implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1+n2;
				l4.setText(String.valueOf(n));
				//l4.setText(n+"");//allowed
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"Invalid Data!");
			}
		}
		
	}
	class B implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1-n2;
				l4.setText(String.valueOf(n));
				//l4.setText(n+"");//allowed
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"Invalid Data!");
			}
		}
		
	}
	class C implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1*n2;
				l4.setText(String.valueOf(n));
				//l4.setText(n+"");//allowed
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"Invalid Data!");
			}
		}
		
	}
	class D implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1/n2;
				l4.setText(String.valueOf(n));
				//l4.setText(n+"");//allowed
			}catch (NumberFormatException | ArithmeticException ex) {
				JOptionPane.showMessageDialog(null,"Invalid Data!");
			}
		}
		
	}
	class E implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1%n2;
				l4.setText(String.valueOf(n));
				//l4.setText(n+"");//allowed
			}catch (NumberFormatException | ArithmeticException ex) {
				JOptionPane.showMessageDialog(null,"Invalid Data!");
			}
		}
		
	}
	Gui(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(400, 300);
		setTitle("Mini Calci");
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		Font font1=new Font(Font.SANS_SERIF,Font.BOLD,14);
		Font font2=new Font(Font.MONOSPACED,Font.BOLD,18);
		
		p=new JPanel();
		p.setBackground(Color.YELLOW);
		p.setBounds(40,30,310,170);
		p.setLayout(null);
		add(p);
		
		l1=new JLabel("Enter 1st Number: ");
		l1.setBounds(20,20,130,30);
		l1.setFont(font1);
		p.add(l1);
		t1=new JTextField();
		t1.setForeground(Color.RED);
		t1.setBounds(160,20,100,30);
		t1.setFont(font1);
		p.add(t1);
		
		l2=new JLabel("Enter 2nd Number: ");
		l2.setBounds(20,70,130,30);
		l2.setFont(font1);
		p.add(l2);
		t2=new JTextField();
		t2.setForeground(Color.RED);
		t2.setBounds(160,70,100,30);
		t2.setFont(font1);
		p.add(t2);
		
		b1=new JButton("+");
		b1.addActionListener(new A());
		b1.setFont(font2);
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.WHITE);
		b1.setBounds(20,120,50,35);
		p.add(b1);
		b2=new JButton("-");
		b2.addActionListener(new B());
		b2.setFont(font2);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.WHITE);
		b2.setBounds(75,120,50,35);
		p.add(b2);
		b3=new JButton("*");
		b3.addActionListener(new C());
		b3.setFont(font2);
		b3.setBackground(Color.DARK_GRAY);
		b3.setForeground(Color.WHITE);
		b3.setBounds(130,120,50,35);
		p.add(b3);
		b4=new JButton("/");
		b4.addActionListener(new D());
		b4.setFont(font2);
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.WHITE);
		b4.setBounds(185,120,50,35);
		p.add(b4);
		b5=new JButton("%");
		b5.addActionListener(new E());
		b5.setFont(font2);
		b5.setBackground(Color.DARK_GRAY);
		b5.setForeground(Color.WHITE);
		b5.setBounds(240,120,50,35);
		p.add(b5);
		
		l3=new JLabel("Answer: ");
		l3.setForeground(Color.WHITE);
		l3.setFont(font1);
		l3.setBounds(40,215,100,30);
		add(l3);
		l4=new JLabel("-----");
		l4.setForeground(Color.YELLOW);
		l4.setFont(font1);
		l4.setBounds(250,215,100,30);
		add(l4);
	}
}
public class MiniCalci {
	public static void main(String[] args) {
		Gui g=new Gui();
		g.setVisible(true);
	}
}