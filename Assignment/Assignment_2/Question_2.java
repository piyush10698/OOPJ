/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 2: Write a program to check whether a given number is even or odd using only 
bitwise operators. (Hint: Use n & 1 to check.) 
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class BitwiseAnd{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number for 'Even Odd' test.");
	
	int a = sc.nextInt();
		
		if ((a & 1)==0)
		{
		System.out.println("The number is even.");	
		}else
		{
		System.out.println("The number is odd.");		
		}
	}
}