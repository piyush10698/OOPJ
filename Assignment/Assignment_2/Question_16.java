/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 16:
Write a program that determines whether the given number is positive, negative or zero
using only the ternary operator.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Sign{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();	
	String result = (a>0)?"Number is positive":"Number is negative";
	if (a==0)
	{
		System.out.println("The Number is zero");
	}else 
	{
		System.out.println(result);
	}
    }
}

	
