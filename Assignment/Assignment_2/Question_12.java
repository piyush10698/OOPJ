/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 12:
Write a Java program to multiply a number by 8 without using * or / operators.
Hint: Use bitwise left shift (<<).
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class MultipliedByEight{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();	

	int result = a << 3;

    System.out.println( a + " multiplied by 8 is: " + result);
	}
}