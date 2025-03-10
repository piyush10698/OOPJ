/*075_Piyush Patil_KH
Assignment 2
========================================================================================
Question 5: Write a Java program to swap two numbers using the += and -= operators only.
---------------------------------------------------------------------------------------*/
import java.util.Scanner;
class SwappingNumbers{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number a = ");
	int a = sc.nextInt();
	System.out.println("Enter the second number b = ");
	int b = sc.nextInt();
	
	a += b;
	b = a-b;
	a -= b;
	
	 System.out.println("After swapping:");
     System.out.println("a = " + a);
     System.out.println("b = " + b);
	
	}
}