/*Assignment 1
075_Piyush Patil_KH
==================================================================================
QUESTION 3:
Write a program to convert a double value to int using typecasting and 
explain the data loss.
-----------------------------------------------------------------------------------*/
class Double_to_int{
	public static void main(String args[]){
		
		double d = 10.52;
		int a = (int)d;
		
		System.out.println(d);
		System.out.println(a);
	}
}
/*-------------------------------------------------------------------------------------
-when we convert double to integer possibly lossy conversion occurs,
 means in above program the value of double i.e 10.52 when converted to
 integer, it will print just 10 and losses the value after the decimal point.
-It may lead to huge losses to the companies. */
