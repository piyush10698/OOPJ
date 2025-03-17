/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 18: Print a Matrix. Given an m x n matrix, print all its elements row-wise.
-------------------------------------------------------------------------------------------*/
 import java.util.Scanner;
 class PrintMatrix{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	
	int arr1[][] = new int [3][3];
	
	for(int i=0;i<3;i++)
	{
	    for(int j=0;j<3;j++)
		{
		  System.out.println("Enter the Elements for MATRIX 1:");
		  arr1[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Your MATRIX 1 is:");
	for (int ar1[] : arr1)
	{
	  for(int x : ar1)
	  {
	  System.out.print(" "+x);
	  }
	  System.out.println();
	} 
  }
 }