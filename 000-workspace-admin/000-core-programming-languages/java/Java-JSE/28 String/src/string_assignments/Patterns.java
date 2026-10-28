package string_assignments;

public class Patterns {

	public static void main(String[] args) {
		
		String s="Incapp";
		pattern1(s);
		System.out.println("____________________________________\n");
		pattern2(s);
		System.out.println("____________________________________\n");
		pattern3(s);
		System.out.println("____________________________________\n");
		pattern4(s);
		System.out.println("____________________________________\n");
		pattern5(s);
		System.out.println("____________________________________\n");
		pattern6(s);
		System.out.println("____________________________________\n");
		pattern7(s);
		System.out.println("____________________________________\n");
		pattern8(s);
		System.out.println("____________________________________\n");
		pattern9(s);
		System.out.println("____________________________________\n");
		pattern10(s);
	
	}
	
	static void pattern1(String s) {
		
		int b=1;
		for(int i=0; i<s.length(); i++) {
			
			for(int j=0; j<b; j++) {
				System.out.print(s.charAt(j));
			}
			b++;
			System.out.println();
			
		}
		
	}
	
	static void pattern2(String s) {
			
			int b=s.length();
			for(int i=0; i<s.length(); i++) {
				
				for(int j=0; j<b; j++) {
					System.out.print(s.charAt(j));
				}
				b--;
				System.out.println();
				
			}
		
		
	
	}
	
	static void pattern3(String s) {
		
		int b=s.length();
		int space=0;
		for(int i=0; i<s.length(); i++) {
			
			for(int c=space; c<i; c++) {
				System.out.print(" ");
			}
			for(int j=0; j<b; j++) {
				System.out.print(s.charAt(j));
			}
			b--;
			System.out.println();
			
		}
	
	

	}
	
	static void pattern4(String s) {
		
		int b=s.length();
		int space=0;
		for(int i=0; i<s.length(); i++) {
			
			for(int j1=0; j1<b; j1++) {
				System.out.print(s.charAt(j1));
			}
			for(int c=0; c<space; c++) {
				
				System.out.print(" ");
			}
			space+=2;
			for(int j2=0; j2<b; j2++ ) {
				
				System.out.print(s.charAt(j2));
			}
			b--;
			System.out.println();
			
	
			
		}
		
		
	}
	
	
	static void pattern5(String s) {
		
		int b=1;
		int space=s.length()*2;
		for(int i=0; i<s.length(); i++) {
			
			for(int j1=0; j1<b; j1++) {
				System.out.print(s.charAt(j1));
			}
			
			for(int c=0; c<space-2; c++) {
				
				System.out.print(" ");
			}
			space-=2;
			for(int j2=0; j2<b; j2++ ) {
				
				System.out.print(s.charAt(j2));
			}
			b++;
			System.out.println();
			
			
		}
	}
	
	static void pattern6(String s) {
		pattern4(s);
		pattern5(s);
	}
	static void pattern7(String s) {
		pattern1(s);
		pattern2(s);
	}
	static void pattern8(String s) {
		int space=s.length();
		int b=1;
		for(int i=0; i<s.length(); i++) {
			for(int c=1; c<space; c++) {
				System.out.print(" ");
			}
			space-=1;
			for(int j=0; j<b; j++) {
				System.out.print(s.charAt(j));
			}
			b+=1;
			System.out.println();
		}
	}
	
	static void pattern9(String s) {
		int space=0;
		int b=s.length();
		for(int i=0; i<s.length(); i++) {
			for(int c=0; c<space; c++) {
				System.out.print(" ");
			}
			space+=1;
			for(int j=0; j<b; j++) {
				System.out.print(s.charAt(j));
			}
			b--;
			System.out.println();
		}
	}
	
	static void pattern10(String s) {
		pattern8(s);
		pattern9(s);
	}
	
	
}

























