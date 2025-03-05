/*Assignment 1
075_Piyush Patil_KH
==================================================================================
QUESTION 8:
Write a program to perform addition, subtraction, multiplication, division, and modulus
operations on two integer numbers and display the results.
-----------------------------------------------------------------------------------*/
class Arithmatics{
	public static void main(String args[]){
		
		int a = 5;
		int b = 10;
		
		int c = a+b;
        int d = b-a;
        int e = a*b;
        int f = b/a;
        int g = a%b;
 
        System.out.println("Addition of 5 and 10 is: "+c);
        System.out.println("Substraction of 10 and 5 is: "+d);		
		System.out.println("Multiplication of 5 and 10 is: "+e);
		System.out.println("Division of 10 and 5 is: "+f);
		System.out.println("Modulus of 5 and 10 is: "+g);
	}
}

