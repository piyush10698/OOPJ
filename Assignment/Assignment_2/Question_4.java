/*075_Piyush Patil_KH
Assignment 2
===========================================================================================
Question 4: Write a program to find whether a given number is divisible by 3 without 
using the modulus (%) or division (/) operators.(Hint: Use subtraction and bitwise shifts.)
------------------------------------------------------------------------------------------*/
import java.util.Scanner;
class DivisibilityOf3{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number.");
	
	int a = sc.nextInt();
	if (a<0) a = -a;	

     while (a >= 3) 
	 {
            a = a - 3;
     }
	
	 if (a == 0) {
            System.out.println("Number is divisible by 3.");
        } else {
            System.out.println("Number is NOT divisible by 3.");
        }
	}
}