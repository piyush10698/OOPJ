/*075_Piyush Patil_KH
Assignment 3
====================================================================================
Question 1: Find the Largest and Smallest Element. Given an array, find the smallest
 and largest elements in it.
-------------------------------------------------------------------------------------*/
class LargestSmallest{
	public static void main(String args[]){
		
		int a[]={1,2,3,4,5};
		
		int smallest = a[0];
		int largest = a[0];
		
		for(int i=0; i<a.length; i++){
			if(a[i]<smallest){
				 smallest = a[i];
			}
			if(a[i]>largest){
				largest = a[i];
			}
		}
		System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
		
	}
}