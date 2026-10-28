package incapp;
//import static p1.A.y;
//import static p1.A.m2;
import static p1.A.*;
//static import p1.A.*;//error
import p1.A;
//import static p1.*;//error
//import  p1.A.*;//error

import javax.swing.JFrame;
import java.lang.*; //by default imported in every java program
public class ImportStaticEx {

	public static void main(String[] args) {
		System.out.println(y);
		m2();
		A a=new A();
		System.out.println(a.x);
		a.m1();
		
		JFrame f=new JFrame();
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
		
		
	}

}
