/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 5: Find Sum and Average. Compute the sum and average of all elements in the array
-------------------------------------------------------------------------------------------*/
class SumAverage{
	public static void main(String args[]){
		
		int a[]={2,5,7,8,9};
		float sum = 0;
		
		for(int i = 0; i<=a.length-1; i++){
			sum += a[i];
		}
		float average = (sum)/(a.length);
		
		System.out.println("The sum of all the numbers of array is = "+sum);
		System.out.println("The Average of all the numbers of array is = "+average);
	}
}