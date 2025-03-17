/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 19: Transpose of a Matrix. Given a matrix, return its
 transpose (swap rows and columns).
-------------------------------------------------------------------------------------------*/
import java.util.Scanner;
class MatrixTranspose{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	
	int arr1[][] = new int [3][3];
	int transpose[][] = new int [3][3];
	
	//for input - MATRIX 1
	for(int i=0;i<3;i++)
	{
	    for(int j=0;j<3;j++)
		{
		  System.out.println("Enter the Elements for MATRIX :");
		  arr1[i][j] = sc.nextInt();
		}
	}
	
	
	System.out.println("-----------------------");
	System.out.println("Your MATRIX is:");
	
	//for output- MATRIX 1
	
	for (int ar1[] : arr1)
	{
	  for(int x : ar1)
	  {
	  System.out.print(" "+x);
	  }
	  System.out.println();
	} 
	
	//Transpose of matrixes
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		transpose[j][i] = arr1[i][j];
		}
	}
	System.out.println("-----------------------");
	System.out.println("Transpose of above MATRIX is:");
	
	//for output - Multiplication matrixes
	
	for (int ar2[] : transpose)
	{
	  for(int y : ar2)
	  {
	  System.out.print(" "+y);
	  }
	  System.out.println();
	} 
        
 }
}