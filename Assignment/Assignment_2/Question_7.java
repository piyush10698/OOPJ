/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 7:
Implement a Java program that checks whether a given year is a leap year or not using
logical (&&, ||) operators.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number for a leap year test.");
	int a = sc.nextInt();
	
	if (((a%4 ==0) && (a%100 !=0)) || (a%400 ==0) )
	{
	System.out.println(a+" is a leap year.");	
	}else
	{
	System.out.println(a+" is not a leap year.");		
	}
	
	}
}