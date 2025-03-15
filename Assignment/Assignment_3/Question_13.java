/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 13: Write a program to accept the marks in Physics, Chemistry and Maths secured by
 20 class students in a single Dimensional Array. Find and display the following:
○ Number of students securing 75% and above in aggregate.
○ Number of students securing 40% and below in aggregate.
-------------------------------------------------------------------------------------------*/
import java.util.Scanner;

 class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int totalMarks[] = new int[20]; 
        int above75 = 0, below40 = 0;
        int maxMarks = 300; 

        // for loop for input
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            int physics = sc.nextInt();
            int chemistry = sc.nextInt();
            int maths = sc.nextInt();
            
            totalMarks[i] = physics + chemistry + maths; 
            
            double percentage = (totalMarks[i] * 100.0) / maxMarks;
           
            if (percentage >= 75) {
                above75++;
            }
            if (percentage <= 40) {
                below40++;
            }
        }

        
        System.out.println("Number of students with 75% and above: " + above75);
        System.out.println("Number of students with 40% and below: " + below40);
        
    }
}
