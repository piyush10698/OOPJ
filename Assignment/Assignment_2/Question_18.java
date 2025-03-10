/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 18:
Given a student’s percentage, print “Pass” if the percentage is 40 or above;
otherwise, print “Fail”, using only the ternary operator.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Marks{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Marks.");
	int a = sc.nextInt();
	
	String m = (a>=40)? ("Pass") : ("Fail");
	System.out.println(m);
    }
}

