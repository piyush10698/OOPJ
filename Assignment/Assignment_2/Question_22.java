/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 22:
Implement a calculator that takes two numbers and an operator (+, -, *, /) as input
and prints the result using only switch-case.
-------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number.");
	double a = sc.nextDouble();
	System.out.println("Enter the Operator.");
	char operator = sc.next().charAt(0);
	System.out.println("Enter the Second Number.");
	double b = sc.nextDouble();
	
	double result;
	switch(operator){
		
	case '+':
    result = a+b;
	System.out.println("result = "+result);
    break;
   	case '-':
    result = a-b;
	System.out.println("result = "+result);
    break;
	case '*':
    result = a*b;
	System.out.println("result = "+result);
    break;
	case '/':
    if (b != 0){
		System.out.println("result = "+a/b);
	}else{
		System.out.println("Error, Division by zero is not allowed.");
	}
    break;
	default:
	System.out.println("Invalid Operator");
	  
	  }
    }
}

