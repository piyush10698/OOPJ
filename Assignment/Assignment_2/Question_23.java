/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 23:
Given a number, find whether it is odd or even using the & bitwise operator and print
the result without using if-else.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	
	int a = sc.nextInt();
	
	String test = ((a & 1 )== 0) ? "Even" : "Odd";
	
	System.out.println("The number is: "+test);
	  
	  
    }
}

