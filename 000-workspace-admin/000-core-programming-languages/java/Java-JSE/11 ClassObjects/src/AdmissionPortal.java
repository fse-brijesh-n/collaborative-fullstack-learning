
public class AdmissionPortal {         
							
	//Main function start***********************************************
		public static void main(String[] args) {
			
			AdmissionPortal start=new AdmissionPortal();
			start.runApplication();
			
		}
	//Main function end***********************************************
	

	void runApplication() {
		
		Application std=new Application();
		
		std.welcome();
		std.setUniversityName();
	    std.setCollageName();
	    std.selectDegree();
		std.getStudentDetails();
		std.clearScreen();
		std.welcome();
		std.viewDetails();	
		std.success();
		std.drawLine();
		std.developerDetails();
		std.thankU();
	}
}
class Application{
	
	String  university="A.P.J Abdul Kalam Technical University Lucknow UP.",
		    collage="Greater Noida Institute of Technology UP",
			school,course="B.Tech",
			branch,
			fname,
			lname,
			dob,
			father,
			mother;
	
	int fees=1030000,collage_code=000;
	String phone,p_phone;
	int tenth_marks;
	int twelfth_marks; 
	
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	void setUniversityName() {
		
		alignCenter();System.out.print("University:");
		university=sc.nextLine();
	}
	
	void setCollageName() {

		alignCenter();System.out.print("Collage :");
		collage=sc.nextLine();
		alignCenter();System.out.print("Collage Code:");
		collage_code=sc.nextInt();
	}
	void selectDegree() {
		
		int choice;
		alignCenter();System.out.println("....................");
		alignCenter();System.out.println("|1.Diploma         |");
		alignCenter();System.out.println("|2.UG              |");
		alignCenter();System.out.println("|3.PG              |");
		alignCenter();System.out.println("....................");
		alignCenter();System.out.print("Select Degree: ");
		choice=sc.nextInt();
		alignCenter();System.out.println("..................");
	
		switch(choice) {
		
		case 1:
			setDiploma();
			success();
			break;
		case 2:
			setUg();
			success();
			break;
		case 3:
			setPg();
			success();
			break;
		default:
			System.out.println("Invalid Degree");
			selectDegree();
		}
	}
	
	void setDiploma() {
		
		alignCenter();System.out.print("Course:");
		course=sc.next();
		alignCenter();System.out.print("Fees:");
		fees=sc.nextInt();
		alignCenter();System.out.print("Branch:");
		branch=sc.next();
	}
	void setUg() {
		
		alignCenter();System.out.print("Course:");
		course=sc.next();
		alignCenter();System.out.print("Fees:");
		fees=sc.nextInt();
		alignCenter();System.out.print("Branch:");
		branch=sc.next();
	}
	void setPg() {
		
		alignCenter();System.out.print("Course:");
		course=sc.next();
		alignCenter();System.out.print("Fees:");
		fees=sc.nextInt();
		alignCenter();System.out.print("branch:");
		branch=sc.next();
	}
	void getStudentDetails() {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		alignCenter();System.out.print("First Name: ");
		fname=sc.nextLine();
		alignCenter();System.out.print("Last Name: ");
		lname=sc.nextLine();
		alignCenter();System.out.print("Date Of Birth: ");
		dob=sc.nextLine();
		alignCenter();System.out.print("Schools Name: ");
		school=sc.nextLine();
		alignCenter();System.out.print("Father's Name: ");
		father=sc.nextLine();
		alignCenter();System.out.print("Mother's Name: ");
		mother=sc.nextLine();
		alignCenter();System.out.print("10th Marks(%): ");
		tenth_marks=sc.nextInt();
		alignCenter();System.out.print("12th Marks(%): ");
		twelfth_marks=sc.nextInt();
		alignCenter();System.out.print("Phone: ");
		phone=sc.next();
		alignCenter();System.out.print("Parents Phone: ");
		p_phone=sc.next();
		if(tenth_marks<=60 || twelfth_marks<=60) {
			alignCenter();System.out.println("You are not eligible");
			alignCenter();thankU();
		}
	
		
	}
	void viewDetails() {
		
		alignCenter();System.out.print("University: "+university+"\n"); 
		alignCenter();System.out.print("Collage: "+collage+"["+collage_code+"]"+"\n\n\n");
		drawLine();System.out.println();
		alignCenter();System.out.print("|Course Name	:"+course+"\n");delay();
		alignCenter();System.out.print("|Fee 		:"+fees+"Rs"+"\n");delay();
		alignCenter();System.out.print("|Branch Name	:"+branch+"\t\t\t\t\n");delay();
		alignCenter();System.out.print("|Name		:"+fname+" "+lname+" "+"Hindu"+"\t\t\t\t\n");delay();
		alignCenter();System.out.print("|Date Of Birth	:"+dob+"\t\t\t\t\n");delay();
		alignCenter();System.out.print("|Schools Name	:"+school+" \t\t\n");delay();
		alignCenter();System.out.print("|Father's Name	:"+father+"\t\t\t\t\n");delay();
		alignCenter();System.out.print("|Mother's Name	:"+mother+"\t\t\t\t\n");delay();
		alignCenter();System.out.print("|10th Marks(%)	:"+tenth_marks+"%\t\t\t\t\t\n");delay();
		alignCenter();System.out.print("|12th Marks(%)	:"+twelfth_marks+"%\t\t\t\t\t\n");delay();
		alignCenter();System.out.print("|Phone		:"+phone+"\t\t\t\t\n");delay();
		alignCenter();System.out.print("|Parents Phone:"+p_phone+"\t\t\t\t\n");delay();
		drawLine();
    	
    	
    }
	
	void welcome() {
		String str="............Welcome to B.Tech Admission Portal...............";
		alignCenter();for(int i=0; i<str.length(); i++) {
			 delay();
			 System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println();
	}
	
	void clearScreen() {
		
		 for (int i = 0; i <30; i++) {
	            System.out.println();
	        }
		
	}
		void success() {
			String str="Data successfully inserted...............";
			alignCenter();for(int i=0; i<str.length(); i++) {
				 delay();
				 System.out.print(str.charAt(i));
			}
			System.out.println();
			
	}
		
	void delay() {
		for(int d=0;d<=2e+7; d++);
	}
	
	void alignCenter() {
		System.out.print("\t\t\t\t");
	}
	
	void drawLine() {
	
			String str="...............................................................";
			alignCenter();for(int i=0; i<str.length(); i++) {
				 delay();
				 System.out.print(str.charAt(i));
			}
			System.out.println();
			
	}
	
   void developerDetails() {
	   
	   String s=
			  "# Organization   : T&C Research Group "
	   		+ "# Contact        : Brijesh@tecrsearch.in  "
	   		+ "# Developer      : Mr.Brijesh "
	   		+ "# Location       : Greater Noida "
	   		+ "# Email          : Mracks.coder@gmail.com"
	   		+ "# Helpline       : +918601084708"
	   		+ "# Website        : http://org.tecresearch.in";
	   
	  for(int i=0; i<s.length(); i++) {
		   
		   if(s.charAt(i)=='#') {
			   
			   alignCenter();System.out.println();
		   }
		   else {
			   delay();
			   System.out.print(s.charAt(i));
		   }
		   
	   }
	   System.out.println();
	   
	   
   }
   
   void thankU(){
	  System.out.println("Thank for use our services");
	   System.out.println("Rating (1-10) : ");
       int rating=sc.nextInt();
       
       if(rating<=10){

       
     for(int i=0; i<rating; i++){

              System.out.print("{*}");
       }
       
       System.out.println();
       

       System.out.println("Thank you for ratings");
       
       System.out.print("[yes] to Close[x]");
       String exit=sc.next();
       if(exit.equalsIgnoreCase("yes")) {
    	   
    	   System.out.println("[x] App closed successfully\n");
           for(int i=0; i<3; i++)
               System.out.println();
          
       }
      
       }
       else
       {
    	 alignCenter();System.out.println("Rating should be 1 to 10");
         thankU();
         
         
         
       }
}
  
}

