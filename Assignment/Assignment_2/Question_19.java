/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 19:
Write a Java program that checks whether a character is uppercase, lowercase, or
not a letter using only the ternary operator.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Character{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Element.");
	char a = sc.next().charAt(0);
	
	String result = (a >= 'A' && a <= 'Z') ? "Uppercase Letter" :(a >= 'a' && a <= 'z') ? "Lowercase Letter" :"Not a Letter";
	System.out.println(result);
    }
}

