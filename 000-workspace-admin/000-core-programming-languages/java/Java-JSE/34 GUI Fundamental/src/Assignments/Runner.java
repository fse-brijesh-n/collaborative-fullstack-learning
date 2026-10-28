package Assignments;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.setLocation(0, 0);
		cal.setVisible(true);
		
		FindReverse fr=new FindReverse();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
		
		SimpleInterest si=new SimpleInterest();
		si.setLocation(900, 0);
		si.setVisible(true);

	}

}
