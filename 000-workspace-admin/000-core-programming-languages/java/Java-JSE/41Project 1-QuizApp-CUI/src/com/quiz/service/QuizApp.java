package com.quiz.service;
import java.util.Scanner;
import com.quiz.service.*;
public class QuizApp{

	public QuizApp(){
		
		while(true) {
		System.out.println("---------------Welcome to TCA quiz playground--------------");
		  System.out.println("1.Login Admin");
		  System.out.println("2.Login User");
		  Scanner sc=new Scanner(System.in);
		  int choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1:
			  System.out.println("Enter your username");
			  String adminUser=sc.next();
			  System.out.println("Enter your password");
			  String AdminPass=sc.next();
			  loginAdmin(adminUser,AdminPass);
			  break;
		  case 2:
			  System.out.println("Enter your username");
			  String username=sc.next();
			  System.out.println("Enter your password");
			  String password=sc.next();
			  loginUser(username,password);
			  break;
		 default: System.out.println("Invalid credentials please try again");
		 
		}
}

	}
	public  void loginAdmin(String adminUser, String adminPass) {
	  if(adminUser.equals("tecresearch")&&adminPass.equals("Admin@tca")) {
		  System.out.println("---------------"+adminUser+" Welcome to TCA quiz playground--------------");
		  System.out.println("Create your quiz");
		  System.out.println("-------------------------------------------------------------------------");
		  System.out.println("Enter the number of Question for your quiz:");
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  System.out.println("Publish your quiz");
		  
	  }else {
		 
				 System.out.println("Invalid credentials...");
	  }
	
}
	 public void loginUser(String username, String password) {
		
		if(username.equals("user") && password.equals("password")) {
			    Playground p1=new Playground();
			    System.out.println("---------------"+username+" Welcome to TCA quiz playground--------------");
			    String result=p1.playQuiz();
			    System.out.println(result);
			    System.out.println("type 'view' show answer::");
			    Scanner sc=new Scanner(System.in);
			    if(sc.next().equals("view")) {
			    	System.out.println("---------------Viewed Answers--------------");
			    	p1.viewAnswer();
			    }
			    sc.close();
		 }else {
			 System.out.println("Invalid credentials...");
		 }
	} 
	 
 
}