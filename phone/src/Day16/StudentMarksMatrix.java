/*Question - WAJP to print Students Marks usind 2D array*/

/*package Day16;

public class StudentMarksMatrix {
	
   public static void main(String[] args) {
	 int[][] marks = {{89,98},{76,89},{92,99},{76,66}};
	 
	 System.out.println("Student's Marks");
	 System.out.println();
	 
	 for(int i=0;i<marks.length;i++) { //outer
		 for(int j=0;j<marks[i].length;j++) {//Inner
			 System.out.println(marks[i][j]+ " ");
		 }
	 }
	 System.out.println();
}
}*/ 

//rows --> students
//columns-->subjects: maths-science

//loops--. outer and inner loops
//outer iterates over students and inner over subject and prints marks
package Day16;

import java.util.Scanner;
  public class StudentMarksMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students and subjects
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        // Declare 2D array
        int[][] marks = new int[students][subjects];

        // Input marks for each student
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Print the marks
        System.out.println("\n--- Students' Marks ---");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

