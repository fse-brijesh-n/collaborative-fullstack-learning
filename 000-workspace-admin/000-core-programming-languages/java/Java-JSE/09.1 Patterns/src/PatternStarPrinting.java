
public class PatternStarPrinting {

	
	public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int n=sc.nextInt();
		 System.out.println("\n.........................................................................\n");
		 System.out.println("Pattern-1");
		 pattern1(n);
		 System.out.println("\n.........................................................................\n");
		 System.out.println("Pattern-2");
		 pattern2(n);
		 System.out.println("\n.........................................................................\n");
		 System.out.println("Pattern-3");
		 pattern3(n);
		 System.out.println("\n.........................................................................\n");
		 System.out.println("Pattern-4");
		 pattern4(n);
		 System.out.println("\n.........................................................................\n");
		 System.out.println("Pattern-5");
		 pattern5(n);
		 System.out.println("\n.........................................................................\n");
		 System.out.println("Pattern-6");
		 pattern6(n);
		 System.out.println("\n.........................................................................\n");
		 System.out.println("Pattern-7");
		 pattern7(n);
	
	sc.close();
	}
	
//Functions for Patterns printing************************************************************************
	static void pattern1(int n) {
		
		int a,b;
		a=n;
		b=1;//to make b=1 for every value of n dynamically
		
//Base variables for patterns a->No of rows , b->No of columns	
		
		for(int i=1; i<=a; i++) {
			
			for(int j=1; j<=b; j++) {
				
				System.out.print("*");
			}
			b++;
		System.out.println();
		
		}
		
	}//End of pattern function*********************************
	

	//Functions for Patterns printing************************************************************************
		static void pattern2(int n) {
			
			int a,b,c;
			a=n;
			b=1;//to make b=1 for every value of n dynamically
			c=n-1;//to make c=n-1 for every value of n dynamically
			
	//Base variables for patterns a->No of rows , b->No of columns	
			
			for(int i=1; i<=a; i++) {
				
				for(int k=1; k<=c; k++) {
					
					System.out.print(" ");
				}
				c--;
				for(int j=1; j<=b; j++) {
					
					System.out.print("*");
				}
				b++;
			System.out.println();
			
			}
			
		}//End of pattern function****************************
	
		//Functions for Patterns printing************************************************************************
				static void pattern3(int n) {
					
					int a,b;
					a=n;
					b=n;
					 
					
			//Base variables for patterns a->No of rows , b->No of columns	
					
					for(int i=1; i<=a; i++) {
						
						 
						for(int j=1; j<=b; j++) {
							
							System.out.print("*");
						}
						b--;
					System.out.println();
					
					}
					
				}//End of pattern function****************************

				//Functions for Patterns printing************************************************************************
						static void pattern4(int n) {
							
							int a,b,c;
							a=n;
							b=n; 
							c=n-1; 
							
					//Base variables for patterns a->No of rows , b->No of columns	
							
							for(int i=1; i<=a; i++) {
								
								for(int k=2; k<=c; k++) {
									
									System.out.print(" ");
								}
								c++;
								for(int j=1; j<=b; j++) {
									
									System.out.print("*");
								}
								b--;
							System.out.println();
							
							}
							
						}//End of pattern function****************************	
						
						//Functions for Patterns printing************************************************************************
						static void pattern5(int n) {
							
							int a,b,c;
							a=n;
							b=1; 
							c=n-1; 
							
					//Base variables for patterns a->No of rows , b->No of columns	
						for(int i=1; i<=a; i++) {
							
							for(int k=1; k<=c; k++) {
								
								System.out.print(" ");
							}
							for(int j=1; j<=b; j++) {
								
								System.out.print("*");
								
							}
							c--;
							b+=2;
							System.out.println();
						}
							
						}//End of pattern function****************************	
						//Functions for Patterns printing************************************************************************
						static void pattern6(int n) {
							
							int a,b,c;
							a=n;
							b=n+(n-1);
							c=1; 
							
					//Base variables for patterns a->No of rows , b->No of columns	
						for(int i=1; i<=a; i++) {
							
						 for(int k=2; k<=c; k++) {
							 System.out.print(" ");
						 }
						 for(int j=1; j<=b; j++) {
							 System.out.print("*");
						 }
						 
						 c++;
						 b-=2;
						 System.out.println();
						}
							
						}//End of pattern function****************************	
						
						//Functions for Patterns printing************************************************************************
						static void pattern7(int n) {
							
							int a,b,c;
							a=n+(n-1);
							b=1;
							c=n-1; 
							
					//Base variables for patterns a->No of rows , b->No of columns	
						for(int i=1; i<=a; i++) {
							
							 for(int k=1; k<=c; k++) {
								 
								 System.out.print(" ");
							 }
							 for(int j=1; j<=b; j++) {
								 
								 System.out.print("*");
							 }
		
							 
							 if(i>(a/2)) {
								 c++;
								 b-=2;
							 }else {
								 
								 c--;
								 b+=2;
							 }
					
						 System.out.println();
						}
							
						}//End of pattern function****************************	
				

		
}//end of Pattern class






