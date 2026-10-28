package string_assignments;

public class Polimdrome {

	public static void main(String[] args) {
		isPolimedrome("RAR AA RAR AA RAR");
		isPolimedrome("Brijesh");
	}
	static void isPolimedrome(String s) {
		 String s1=s;
		 char s2[]=new char[s.length()];
		 
		 boolean status=false;
		 for(int i=s1.length()-1,k=0; i>=0; i--,k++) {
			
			 s2[k]=s1.charAt(i);
			
	}
		  for(int i=0; i<s1.length(); i++) {
			  if(s1.charAt(i)==s2[i]) {
				  status=true;
			  }else {
				  status=false;
				  break;
			  }
		  }
		
		 if(status) {
			 System.out.println(s+" is palimedrome");
		 }else {
			 System.out.println(s+" is not palimedrome");
		 }
		 	 
		
}
}