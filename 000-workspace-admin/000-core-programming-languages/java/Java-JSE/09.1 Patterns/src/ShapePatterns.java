
public class ShapePatterns {

	public static void main(String[] args) {
		
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("Enter a number");
			int n=sc.nextInt();
			ShapePatterns obj1=new ShapePatterns();
			System.out.println(".............................................\n");
			System.out.println("Ractangle");
			System.out.println(".............................................\n");
			obj1.ractanglePrint(n);
			System.out.println("Circle");
			obj1.circlePrint(n);
			
			sc.close();
	}
    static void ractanglePrint(int n) {
    	int a=n;
    	int b=n;
    	int c=n;
    	for(int i=1; i<=a; i++) {
    		
    		if(i==1 || i==(n)) {
    			
    			for(int j=1; j<=b; j++) {
        			
        			System.out.print(".");
        		}
    		}
    		else {
    			
	    			for(int k=1; k<=c; k++) {
	            		
	            		if(k==1 || k==(n)) {
	            			System.out.print(".");
	            		}else {
	            			System.out.print(" ");
	            		}
	    			}
	    			
    		
        		}
    		System.out.println();
			
    	}
    	
    	
    	
    }
    
    static void circlePrint(int n) {
    			
    	  System.out.println("Code to be written...");
  
    }
    
}
