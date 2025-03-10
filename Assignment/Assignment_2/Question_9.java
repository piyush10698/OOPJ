/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 9:
Implement a java program that checks if a number is within a specific range 
(20 to 50) without using if-else.(Hint: Use logical AND (&&) in a print statement).
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Range{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value.");
	int a = sc.nextInt();	
	
	System.out.println("Is the entered number between 20-50 = "+((a>20) && (a<50)));
	
	
	}
}