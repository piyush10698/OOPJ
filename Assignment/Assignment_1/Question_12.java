/*Assignment 1
075_Piyush Patil_KH
==================================================================================
QUESTION 12:
Write a program to demonstrate the use of assignment operators 
(=, +=, -=, *=, /=, %=) on two integers.
-----------------------------------------------------------------------------------*/
class AssignmentOperators{
	public static void main(String args[]){
		
		int c = 2;
		int d = 5;
		int e = 10;
		int f = 14;
		int g = 20;
		int a = 10;
	    int b = a;   //b = a = 10
	     c += a;  //c = c + a = 12
		 d -= a;  //d = d - a = -5
   		 e *= a;  //e = e * a = 100
		 f /= a;  //f = f / a = 1
		 g %= a;  //g = g % a = 0
		
		System.out.println("The value of b is equal to a i.e: "+b);
		System.out.println("The value of c: "+c);
		System.out.println("The value of d: "+d);
		System.out.println("The value of e: "+e);
		System.out.println("The value of f: "+f);
		System.out.println("The value of g: "+g);
	}
}

