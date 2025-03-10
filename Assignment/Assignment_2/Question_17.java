/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 17:
Implement a Java program that finds the minimum of four numbers using nested
ternary operators.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Minimum{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();	
	
	int e = (a < b) ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d)) : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
	System.out.println("Minimum of all four numbers is: "+e);
    }
}

