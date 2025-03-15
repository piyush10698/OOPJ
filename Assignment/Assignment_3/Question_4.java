/*075_Piyush Patil_KH
Assignment 3
====================================================================================
Question 4: Count the number of even and odd numbers in an array.
-------------------------------------------------------------------------------------*/
class EvenOdd{
	public static void main(String args[]){
		
		int a[]={2,5,7,8,9};
		int count_even = 0;
		int count_odd = 0;
		for(int i=0; i<= a.length-1; i++){
			if(a[i]%2==0){
				count_even ++;
			}else{
				count_odd ++;
			}
		}
		System.out.println("Total Even Numbers = "+count_even);
		System.out.println("Total odd Numbers = "+count_odd);
	}
}