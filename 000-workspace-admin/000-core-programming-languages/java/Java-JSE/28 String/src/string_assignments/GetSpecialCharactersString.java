package string_assignments;

public class GetSpecialCharactersString {

	public static void main(String[] args) {
		String s="  !Brijesh Nishad ,,,, Incapp Coding Institute@# $5^  ";
		getSpecialCharacters(s);
		System.out.println("_____________________________________");
		getWordCount(s);
		removeSpecialCharaters(s);
		System.out.println("_____________________________________");
	}

	static void getSpecialCharacters(String s){
		int space=0;
		int lowercase=0;
		int uppercase=0;
		int digit=0;
		int spacial_character=0;
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==' ') {
				space++;
			}else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				lowercase++;
			}else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				uppercase++;	
			}else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				digit++;
			}else {
				spacial_character++;
			}
		}
		System.out.println("No of spaces: "+space);
		System.out.println("No of lowercases: "+lowercase);
		System.out.println("No of uppercases: "+uppercase);
		System.out.println("No of digits: "+digit);
		System.out.println("No of spacial characters: "+spacial_character);
		
	}
	
	static void getWordCount(String s) {
		
		s=s.replaceAll("\\s+", " ").trim();//used to remove extra spaces
//		System.out.println(s.split("\\s").length);count word using functions
		
		//without pre-define functions
		System.out.println(s);
		int word=1;
		if(s!="") {
			for(int i=0; i<s.length(); i++) {
					if(s.charAt(i)==' ') {
						word++;
					}
			}
			
			System.out.println("No of words: "+word);
			}else {
				System.out.println("Empty string");
			}
		}
		
	static void removeSpecialCharaters(String s) {
		String s1=s;
		s1=s.replaceAll("[^a-b0-9A-z][\\s]", "");//removing special characters
		String temp=s1.replaceAll("[\\s]", " ").trim();//replacing all space with single space
		System.out.println(temp);
	}
}
