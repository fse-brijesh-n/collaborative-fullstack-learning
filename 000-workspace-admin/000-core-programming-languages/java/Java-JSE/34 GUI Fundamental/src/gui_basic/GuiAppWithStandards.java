package gui_basic;
import javax.swing.*;
import java.awt.*;

class Gui extends JFrame{
	JButton b1;
	JButton b2;
	JLabel l;
	JTextField t;
	Gui(){
		
		setTitle("Mera Pehla Frame");
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(199, 219, 42));
		setLayout(null);
		
		b1=new JButton("OK 1");
		b1.setBounds(50,40,70,40); // X Y W H
		b1.setBackground(Color.RED);
		b1.setForeground(Color.WHITE);
		add(b1);
		
		b2=new JButton("OK 2");
		b2.setBounds(130,40,70,40); // X Y W H
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		add(b2);
		
		l=new JLabel("Hello INCAPP");
		l.setBounds(50,100,100,40); // X Y W H
		l.setForeground(Color.MAGENTA);
		add(l);
		
		t=new JTextField();
		t.setBounds(50,150,100,40); // X Y W H
		t.setForeground(Color.RED);
		add(t);
	}
}
public class GuiAppWithStandards {
	public static void main(String[] args) {
		Gui g=new Gui();
		g.setVisible(true);
		
		Gui g2=new Gui();
		g2.setSize(250,250);
		g2.setVisible(true);
	}
}