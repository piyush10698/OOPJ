/*Assignment 1
075_Piyush Patil_KH
==================================================================================
QUESTION 1:
Create a program that declares and initializes all primitive data types in Java and 
prints their default and assigned values.
-----------------------------------------------------------------------------------*/
class DefaultValues{
	static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;
	
	public static void main(String args[]){
		System.out.println("Default values of Primitive Datatypes are as follows: ");
		System.out.println("byte = "+b);
		System.out.println("short = "+s);
		System.out.println("int = "+i);
		System.out.println("long = "+l);
		System.out.println("float = "+f);
		System.out.println("double = "+d);
		System.out.println("char = [" + c + "](Unicode: " + (int) c+")");
		System.out.println("boolean = "+bool);
        System.out.println();
		
        byte b1 = 5;
        short s1 = 10;
        int i1 = 15;
        long l1 = 500;
        float f1 = 12.3f;
        double d1 = 12.356;
        char c1 = 'p';
        boolean bool1 = true;
	 
	    System.out.println("Values of Primitive Datatypes assigned to them are as follows: ");
	    System.out.println("byte = "+b1);
	    System.out.println("short = "+s1);
	    System.out.println("int = "+i1);
	    System.out.println("long = "+l1);
	    System.out.println("float = "+f1);
	    System.out.println("double = "+d1);
	    System.out.println("char = "+c1);
	    System.out.println("boolean = "+bool);
	}
	
}