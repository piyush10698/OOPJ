/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 8:
Write a program that takes three boolean inputs and prints true if at least two of
them are true.(Hint: Use logical operators (&&, ||)).
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Boolean{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter boolean values.");
	boolean a = sc.nextBoolean();
	boolean b = sc.nextBoolean();
	boolean c = sc.nextBoolean();
	
	boolean result = ((a&&b) || (b&&c) || (a&&c));
	
	System.out.println("Are two of the entered values are true = "+result);
	
	
	}
}