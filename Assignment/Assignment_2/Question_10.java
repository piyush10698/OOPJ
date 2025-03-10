/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 10:
Write a program to determine if a character is a vowel or a consonant using the
ternary operator.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Alphabet{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Capital letter.");
	char a = sc.next().charAt(0);	

	String result = (a =='A' || a =='E' || a =='I' || a =='O' || a =='U') ? ("Entered letter is vowel"):("Entered letter is consonant");
	
	System.out.println(result);
	}
}