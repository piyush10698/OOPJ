/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 6: Remove Duplicates from a Sorted Array. Remove duplicate elements from a sorted 
array without using extra space.
-------------------------------------------------------------------------------------------*/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int j = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) { 
                j++; 
                arr[j] = arr[i]; 
            }
        }

        return j + 1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);

       
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
		
	}
}