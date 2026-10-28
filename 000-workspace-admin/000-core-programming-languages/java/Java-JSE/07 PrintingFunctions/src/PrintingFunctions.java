
public class PrintingFunctions {

	public static void main(String[] args) {
		System.out.println("Printing function in java ");
		/*
		 * printf-with format specifier by c
		 * format-with format specifier by java
		 * print-without format specifier 
		 * println-without format specifier with new line printing expressions
		 * 
		 * 
		 */
		
		double a=12.133243;
		int b=14;
		char c='h';
		String d="Incapp";
		boolean e=true;
		
		System.out.println("------------------Printing via printf---------------------");
		System.out.printf("%f%n",a);
		System.out.printf("%.2f%n",a);
		
		System.out.printf("%e%n",a);
		System.out.printf("%E%n",a);
		
		System.out.printf("%d%n",b);
		System.out.printf("%x%n",b);
		System.out.printf("%X%n",b);
		
		System.out.printf("%c%n",c);
		
		System.out.printf("%s%n",d);
		System.out.printf("%S%n",d);
		System.out.printf("%10s%n",d);
		System.out.printf("%-10S%n",d);
		
		System.out.printf("%.2S%n",d);
		System.out.printf("%.3s%n",d);
		
		
		System.out.printf("%b%n",e);
		System.out.printf("%B%n",e);
		
		
		System.out.println("-------------------printing via format--------------------");
		System.out.format("%f",a);
		System.out.format("%.2f",a);
		
		System.out.format("%e%n",a);
		System.out.format("%E%n",a);
		
		System.out.format("%d",b);
		System.out.format("%x%n",b);
		System.out.format("%X%n",b);
		
		System.out.format("%c",c);
		
		System.out.format("%s",d);
		System.out.format("%S",d);
		System.out.format("%10s",d);
		System.out.format("%-10S",d);
		

		System.out.format("%.2S%n",d);
		System.out.format("%.3s%n",d);
		
		System.out.format("%b",e);
		System.out.format("%B",e);
		
		System.out.println("------------------printing via print---------------------");
		
		System.out.print(a+"%n"+"%n"+b+"%n"+c+"%n"+d+"%n"+e);
		
		System.out.println("---------------------printing via println------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
	}

}
