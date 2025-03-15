/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 9: Find Missing Number in an Array.Given an array of size n-1 containing numbers
 from 1 to n, find the missing number.
-------------------------------------------------------------------------------------------*/
class MissingNumber{
	
		public static int findMissingNumber(int a[], int n){
			
			int sum = n * (n + 1) / 2; 
            int actualSum = 0;
			for(int b : a){
				actualSum += b;
			}
			return sum - actualSum;
		}
		
		public static void main(String args[]){
		int a[] = {1,2,3,5,6};
		int n= 6;
		
		System.out.println("Missing Number: "+findMissingNumber(a,n));
	}
}