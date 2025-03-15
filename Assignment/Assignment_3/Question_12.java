/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 12: Write a program to accept 20 integer numbers in a single Dimensional Array. 
Find and Display the following:
○ Number of even numbers.
○ Number of odd numbers.
○ Number of multiples of 3.
-------------------------------------------------------------------------------------------*/
import java.util.Scanner;
class Array{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int even = 0;
		int odd = 0;
		int multipleOfThree = 0;
		
		//input for loop
		for(int i=0; i<20; i++)
		{
			System.out.println("Enter Integer");
			a[i] = sc.nextInt();
		}
		//for loop = even number
		for(int j=0; j<20; j++)
		{
			if(a[j] % 2 == 0)
			{
				even ++;
			}
		}
		System.out.println("Total even elements: "+even);
		
		//for loop = odd number
		for(int j=0; j<20; j++)
		{
			if(a[j] % 2 != 0)
			{
				odd ++;
			}
		}
		System.out.println("Total odd elements: "+odd);
		
		//for loop = multiples of three
		for(int j=0; j<20; j++)
		{
			if(a[j] % 3 == 0)
			{
				multipleOfThree ++;
			}
		}
		System.out.println("Total multiples of three: "+multipleOfThree);
	}
}