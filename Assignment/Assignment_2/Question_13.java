/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 13:
Implement a Java program to find the absolute value of an integer using bitwise
operators. Hint: mask = num >> 31; abs = (num + mask) ^ mask;
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class AbsoluteValue{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();	

	int mask = a >> 31;  
    int abs = (a + mask) ^ mask;

    System.out.println("Absolute value: " + abs);
    }
}

	
