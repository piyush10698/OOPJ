/*075_Piyush Patil_KH
Assignment 2
====================================================================================
Question 24:
Write a program that prints all even numbers from 1 to 100 using only bitwise AND
(&) and for loop.
-------------------------------------------------------------------------------------*/
class EvenNumbers{
	public static void main(String args[]){
		
	
	System.out.println("All Even numbers between 1-100.");
	
	for (int i = 1; i <= 100; i++) {
            
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
  }
}

