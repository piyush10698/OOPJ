/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 1: Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or -.(Hint: Use bitwise XOR ^ operator.)
-------------------------------------------------------------------------------------*/
class BitwisewShift{
	public static void main(String args[]){
		
		int a = 9;
		int b = 5;
		System.out.println("Before Swapping a = "+a+" and b = "+b);
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("After Swapping a = "+a+" and b = "+b);
	}
}