/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 14:
Write a program to count the number of 1s (set bits) in a binary representation of a
number using bitwise operations.(Hint: Use n & (n - 1)).
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class AbsoluteValue{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number.");
	int a = sc.nextInt();	

    count = 0;
        
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("Number of set bits: " + count);
    }
}

	
