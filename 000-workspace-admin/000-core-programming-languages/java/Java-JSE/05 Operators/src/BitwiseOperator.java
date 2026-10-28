
public class BitwiseOperator {

	public static void main(String[] args) {
		 
				/*
				 * 
				 *bitwise and & 
				 *bitwise or |
				 *bitwise XOR ^  both same then 1
				 *bitwise negation ~ uniry operator ++,--
				 *bitwise right shift >>
				 *bitwise left shift <<
				 *
				 */
		
		int bin=0b01010;
		int bin1=0b01001;
		int r1=bin&bin1;
		System.out.println(r1);
		int r2=bin|bin1;
		System.out.println(r2);
		int r3=bin^bin1;
		System.out.println(r3);
		int r4=bin>>1;// one bit right shift
		System.out.println(r4);
		int r5=bin<<2;// two bit left shift
		System.out.println(r5);
		int r6=~bin1;
		System.out.println(r6);
		
		
	}

}
