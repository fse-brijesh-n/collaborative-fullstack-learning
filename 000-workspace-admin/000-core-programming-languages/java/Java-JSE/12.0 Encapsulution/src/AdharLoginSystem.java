 import java.util.Random;//only use to Generate the UIDAI number
 import java.util.UUID;//only use to Generate the Face ID
public class AdharLoginSystem {

	public static void main(String[] args) {
		
		 Adhaar start=new Adhaar();
		 start.runApplication();
		 
	}

}

 class Adhaar{
	 
	 static String ar="Adhaar Registration";
	 static String al="Adhaar Login";
	 static String ad="Adhaar Details";
	 static String adr="Unique Identification Authority of India";
	 
	 private String fname,lname,email,dob,father,village,post,block,state,district;
	 private long password;
	 private long phone;
	 private long adhaar;
	 private long face_id;
	 private long left_hand;
	 private long right_hand; 
	 private long pincode;
	 long input_adhaar;
	 long input_username;
	 long input_password;
	 long input_face_id;
	 long input_left_hand;
	 long input_right_hand;
	 
	 
	 static java.util.Scanner sc=new java.util.Scanner(System.in);
	 
	 void runApplication() {
		 int choice;
		 String ch;
		 do {
			 welcome();
			 drawLine();
			 alignCenter();System.out.println("1.New Adhaar");
			 alignCenter();System.out.println("2.Login Adhaar");
			 drawLine();
			 alignCenter();System.out.print("Select: ");
			 choice=sc.nextInt();
			 drawLine();
			 clearScreen();
			 switch(choice) {
			 case 1:
				 newAdhaar();
				 break;
			 case 2:
				 loginAdhaar();
				 break;
			 default:
				 alignCenter();System.out.println("Invalid choice");
			 }
			 alignCenter();System.out.println("Do you want to [yes] continue...");
			 ch=sc.next();
			 
		 }while(ch.equalsIgnoreCase("yes"));
		 
		 
	 }
	 private void newAdhaar() {
		 drawLine();
		 alignCenter();System.out.println(ar);
		 drawLine();
		 alignCenter();System.out.print("First Name: ");
		 fname=sc.next();
		 alignCenter();System.out.print("Last Name: ");
		 lname=sc.next();
		 alignCenter();System.out.print("Password: ");
		 password=sc.nextLong();
		 alignCenter();System.out.print("Email: ");
		 email=sc.next();
		 alignCenter();System.out.print("Phone: ");
		 phone=sc.nextLong();
		 alignCenter();System.out.print("Date of Birth: ");
		 dob=sc.next();
		 alignCenter();System.out.print("Father: ");
		 father=sc.next();
		 alignCenter();System.out.print("Village: ");
		 village=sc.next();
		 alignCenter();System.out.print("Post: ");
		 post=sc.next();
		 alignCenter();System.out.print("Block: ");
		 block=sc.next();
		 alignCenter();System.out.print("District: ");
		 district=sc.next();
		 alignCenter();System.out.print("State: ");
		 state=sc.next();
		 alignCenter();System.out.print("Pincode: ");
		 pincode=sc.nextLong();
		 drawLine();
		//Capture face fingure and generate aadhaar
		 pleaseWait();
		 captureFaceSuccess();
		 pleaseWait();
		 captureLeftSuccess();
		 pleaseWait();
		 captureRightSuccess();
		 success();
		 alignCenter();System.out.println("Registration successful");
		 drawLine();
		 //Capture face fingure and generate aadhaar
		  adhaar= gernarateAdhaar();
		  face_id=generateFaceId();
		  left_hand=generateLeftHandId();
		  right_hand=generateRightHandId();
		 
		 clearScreen();
		 drawLine();
		 alignCenter();System.out.println("face_id:"+face_id+"(Copy)");
		 alignCenter();System.out.println("Left Hand FingerPrint Id:"+left_hand+"(Copy)");
		 alignCenter();System.out.println("Right Hand FingerPrint Id:"+right_hand+"(Copy)");
		 alignCenter();System.out.println("Aadhaar Number:"+adhaar+"(Copy)");
		 alignCenter();System.out.println("Password:"+password+"(Copy)");
		 drawLine();
		 loginAdhaar();
		 
	 }
	 
	 private void loginAdhaar() {
		 alignCenter();System.out.println(al);
		 drawLine();
		
		 alignCenter();System.out.print("Face Id : ");
		 input_face_id=sc.nextLong();
		 alignCenter();System.out.print("Left Hand FingerPrint Id : ");
		 input_left_hand=sc.nextLong();
		 alignCenter();System.out.print("Right Hand FingerPrint Id : ");
		 input_right_hand=sc.nextLong();
		 alignCenter();System.out.print("Aadhaar no: ");
		 input_adhaar=sc.nextLong();
		 alignCenter();System.out.print("Password: ");
		 input_password=sc.nextLong();
		 
		 
		 drawLine();
		 
		 
		 if(input_adhaar==adhaar && input_password==password && input_face_id==face_id &&  input_left_hand==left_hand && input_right_hand==right_hand) {
			 clearScreen();
			 drawLine();
			 alignCenter(); System.out.println("\t"+adr);
			 drawLine();
			 alignCenter(); System.out.println("Name: "+fname+" "+lname+"\t\tLogged In:("+input_adhaar+")");
			 
			 detailsAdhaar();
			 
		 }else {
			 alignCenter();System.out.println("Invalid credentials......");
			 runApplication();	 
		 }
		 
	 }
	//capture face and fingerprint
	 
	 void pleaseWait() {
		   
		 String str="Please wait............................................";
			alignCenter();for(int i=0; i<str.length(); i++) {
				 delay();
				 System.out.print(str.charAt(i));
			}
			System.out.println();
		 delay();
	 }
	private static void captureFaceSuccess(){
		String str="Face captured successfully ............................";
		alignCenter();for(int i=0; i<str.length(); i++) {
			 delay();
			 System.out.print(str.charAt(i));
		}
		System.out.println();
	 }
	private static void captureLeftSuccess(){
		String str="Left Hand FingerPrint Captured successfully ...........";
		alignCenter();for(int i=0; i<str.length(); i++) {
			 delay();
			 System.out.print(str.charAt(i));
		}
		System.out.println();
	 }
	private static void captureRightSuccess(){
		String str="Right Hand FingerPrint Captured successfully ..........";
		alignCenter();for(int i=0; i<str.length(); i++) {
			 delay();
			 System.out.print(str.charAt(i));
		}
		System.out.println();
	 }
	 
	 
		 // Generate FaceID
	private  long generateFaceId() {
		Random random = new Random();
        long number1= (random.nextLong() % 900000000L) + 100000000L;
        return Math.abs(number1);
		    }

		 // Generate Left Hand Fingerprint    
	 private  long generateLeftHandId() {
		 Random random = new Random();
         long number2 = (random.nextLong() % 900000000L) + 100000000L;
         return Math.abs(number2);
	 }
	 // Generate Right Hand Fingerprint 
	 private  long generateRightHandId() {
		 Random random = new Random();
         long number3 = (random.nextLong() % 900000000L) + 100000000L;
         return Math.abs(number3);
	 }
	 
	 
	 private void detailsAdhaar() {
		
		 drawLine();
		 alignCenter(); System.out.println("Adhaar no: "+adhaar);
		 alignCenter(); System.out.println("Password: "+password);
		
		 alignCenter(); System.out.println("Email: "+email);
	
		 alignCenter(); System.out.println("Phone: "+phone);
		 
		 alignCenter();System.out.println("Date of Birth: "+dob);
		
		 alignCenter(); System.out.println("Father: "+father);
		 
		 alignCenter(); System.out.println("Village: "+village);
		
		 alignCenter();System.out.println("Post: "+post);
		 
		 alignCenter();System.out.println("Block: "+block);
		
		 alignCenter();System.out.println("District: "+district);
		 
		 alignCenter(); System.out.println("State: "+state);
		 
		 alignCenter(); System.out.println("Pincode: "+pincode);
		 drawLine();
		 developerDetails();
		 thankU();
	 }
	 
	 private long gernarateAdhaar() {
         Random random = new Random();
         long number = (random.nextLong() % 900000000000L) + 100000000000L;
         return Math.abs(number);
     }

	 //******************************************************primary code
	 
	static  void welcome() {
			String str="...................Adhaar Portal.......................";
			alignCenter();for(int i=0; i<str.length(); i++) {
				 delay();
				 System.out.print(str.charAt(i));
			}
			System.out.println();
			System.out.println();
		}
		
	static void clearScreen() {
			
		 for (int i = 0; i <18; i++) {
	            System.out.println();
	        }
		
	}
	 static void success() {
			String str="Data successfully inserted.............................";
			alignCenter();for(int i=0; i<str.length(); i++) {
				 delay();
				 System.out.print(str.charAt(i));
			}
			System.out.println();
			
	}
	 
	static void delay() {
			for(int d=0;d<=2e+7; d++);
		}
	 
	 static void alignCenter() {
			System.out.print("\t\t\t\t");
		}
	 
	 static void drawLine() {
			
			String str=".......................................................";
			alignCenter();for(int i=0; i<str.length(); i++) {
				 delay();
				 System.out.print(str.charAt(i));
			}
			System.out.println();
			
	}
	 static void developerDetails() {
		   
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
	 
	 static void thankU(){
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