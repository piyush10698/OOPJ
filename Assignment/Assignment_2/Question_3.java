/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 3: Implement a program that calculates the sum of digits of an integer using
 modulus(%) and division (/) operators.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class SumOfDigits{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number.");
	
	int a = sc.nextInt();
		
	int sum = 0;
	
	while(a!=0)
	{
		sum += a%10;
		a /= 10;
	}
	System.out.println("Sum of all digits of the given number is: "+sum);
	}
}