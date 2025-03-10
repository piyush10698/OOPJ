/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 6:
Write a program to find the largest of three numbers using only the ternary operator
(? :)
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class LargestNumber{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number a = ");
	int a = sc.nextInt();
	System.out.println("Enter the second number b = ");
	int b = sc.nextInt();
	System.out.println("Enter the second number c = ");
	int c = sc.nextInt();
	
	int max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
	
	System.out.println("Largest number among the three is: "+max);
	
	}
}