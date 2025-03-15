/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 14: Write a program in java to accept 20 numbers in a single dimensional array 
arr[20]. Transfer and store all the even numbers in an array even[ ] and all the odd numbers
 in another array odd[ ]. Finally, print the elements of the even & the odd array
-------------------------------------------------------------------------------------------*/
import java.util.Scanner;

 class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		int evenNum = 0;
		int oddNum = 0;
		
		for(int i=0; i<20; i++)
		{
			System.out.println("Enter "+ (i+1) +" Element.");
		    arr[i] = sc.nextInt();
		
		
		if(arr[i] % 2 == 0){
			evenNum ++;
		}else{
			oddNum ++;
		}
	 }
	 
	 int even[] = new int[evenNum];
	 int odd[] = new int[oddNum];
	 int evenIndex = 0;
	 int oddIndex = 0;
	 
	 for(int i =0; i<20; i++)
	 {
		if(arr[i]%2==0)
		{
			even[evenIndex++] = arr[i];
		} else
		{
			odd[oddIndex++] = arr[i];
		}
	 }
	 
	  System.out.println("Even numbers: ");
        for (int x : even) {
            System.out.print(x + " ");
        }
        System.out.println();
      
	   System.out.println("Odd numbers:");
        for (int y : odd) {
            System.out.print(y + " ");
        }
        System.out.println();
   }
 }