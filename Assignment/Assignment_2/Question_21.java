/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 21:
Write a program that increments a number without using + or ++ operators.
Hint: Use bitwise - (~x).
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Increment{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();
	
	int b = -~a; 

    System.out.println("Incremented number: " +b);
    }
}

