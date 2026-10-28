class ASA{ 
	static int x; int y;
	void m(int a) { 
	y=a; 
	
	} 
		public static void main(String[] args){ 
			
			System.out.println(ASA.x); ASA a= new ASA();
		a.m(4); a.x=3; System.out.println(ASA.x); 
		System.out.println(a.y); System.out.println(a.x); 
		}
}


