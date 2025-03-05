/*Assignment 1
075_Piyush Patil_KH
==================================================================================
QUESTION 6:
Write a program to display character and string literals along with their ASCII values.
-----------------------------------------------------------------------------------*/
class ASCII{
	public static void main(String args[]){
		
		char a = 'A';
		int c = (int) a;
		System.out.println("ASCII value of A is: "+c);
		
		String b = "INDIA";
		System.out.println("ASCII values of characters of INDIA:");
		for (int i = 0; i<b.length(); i++){
			char ch = b.charAt(i);
			int ascii = (int)ch;
			System.out.println(" '"+ch+"' = "+ascii);
	  }
		
	}
}

