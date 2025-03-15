/*075_Piyush Patil_KH
Assignment 3
====================================================================================
Question 3: Find the second-largest element in the given array.
-------------------------------------------------------------------------------------*/
class SecondLargest{
	public static void main(String args[]){
		
		int a[]={2,5,7,8,9};
		
		System.out.println("Second Largest: " + findSecondLargest(a));
    }

    public static int findSecondLargest(int[] a) {
        if (a.length < 2) {
            System.out.println("Array must have at least two elements!");
            return -1;
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > first) { 
                second = first;  // Previous largest becomes second-largest
                first = num;     // Update largest
            } else if (num > second && num < first) {
                second = num;    // Update second-largest only if it's less than first
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
		
	}
}