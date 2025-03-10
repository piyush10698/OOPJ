/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 11:
Write a program to check if a given number is a power of 2 using bitwise operators.
Hint: n & (n - 1) == 0 for positive numbers.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class PowerOftwo{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();	

	System.out.println(a+" is power of two: "+((a>0) && ((a & (a - 1)) == 0)));
	}
}