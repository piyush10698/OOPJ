/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 20:
Implement a Java program that returns the absolute value of a given number using
the ternary operator (without using Math.abs()).
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Abs{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();
	
	int b = (a>0) ? a : -a;
	
	System.out.println("Absolute value is "+b);
    }
}

