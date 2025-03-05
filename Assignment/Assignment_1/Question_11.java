/*Assignment 1
075_Piyush Patil_KH
==================================================================================
QUESTION 11:
Write a program to check if a number is positive and even using logical operators (&&, ||, !).
-----------------------------------------------------------------------------------*/
import java.util.Scanner;
class LogicalOperators{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the number: ");
		if (a>0 && a%2==0){
			System.out.println("'a' is a even positive integer.");
         }else if(a<0 || a%2!=0));
		    System.out.println("'a' is either a negative or a odd number.");
	}
}

