/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 20: Sum of Two Matrices. Given two matrices of the same size, compute their sum.
-------------------------------------------------------------------------------------------*/
import java.util.Scanner;
class SumOfMatrix{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	
	int arr1[][] = new int [3][3];
	int arr2[][] = new int [3][3];
	int sumarr[][] = new int [3][3];
	//for input - MATRIX 1
	for(int i=0;i<3;i++)
	{
	    for(int j=0;j<3;j++)
		{
		  System.out.println("Enter the Elements for MATRIX 1:");
		  arr1[i][j] = sc.nextInt();
		}
	}
	//for input - MARTIX 2
	for(int i=0;i<3;i++)
	{
	    for(int j=0;j<3;j++)
		{
		  System.out.println("Enter the Elements for MATRIX 2:");
		  arr2[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("-----------------------");
	System.out.println("Your MATRIX 1 is:");
	
	//for output- MATRIX 1
	
	for (int ar1[] : arr1)
	{
	  for(int x : ar1)
	  {
	  System.out.print(" "+x);
	  }
	  System.out.println();
	} 
	System.out.println("-----------------------");
	System.out.println("Your MATRIX 2 is:");
	
	//for output MATRIX 2
	
	for (int ar2[] : arr2)
	{
	  for(int y : ar2)
	  {
	  System.out.print(" "+y);
	  }
	  System.out.println();
	} 
	//Addition of matrixes
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		sumarr[i][j] = arr1[i][j] + arr2[i][j];
		}
	}
	System.out.println("-----------------------");
	System.out.println("Sum of above two Matrix is:");
	
	//for output - sum matrixes
	
	for(int ar3[]: sumarr)
	{
		for(int z:ar3)
		{
			System.out.print(" "+z);
		}
		System.out.println();
	}
  
        
 }
}