/*Assignment 1
075_Piyush Patil_KH
==================================================================================
QUESTION 5:
Write a program to demonstrate binary, octal, hexadecimal, and floating-point 
literals in Java.
-----------------------------------------------------------------------------------*/
class Literals{
	public static void main(String args[]){
		
		int binary = 0b0101;
		int octal = 012;
		int hexadecimal = 0xA;
		float f = 1.234f;
		double d = 1.897487;
		
		System.out.println("Decimal value of binary 0101 is: "+binary);
		System.out.println("Decimal value of octal number 012 is: "+octal);
		System.out.println("Decimal value of hexadecimal number 0xA is: "+hexadecimal);
		System.out.println("float of 1.234f is: "+f);
		System.out.println("Double of 1.897487 is: "+d);
	}
}

