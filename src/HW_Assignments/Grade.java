package HW_Assignments;

import java.util.Scanner;

public class Grade {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String first, last;
		double average;
		// enter names
		System.out.print("First name: ");
		first = in.next();
		System.out.print("Last name: ");
		last = in.next();
		calcGrade(first, last); // get grades and average them
	}

	// get scores and calculated grades
	public static void calcGrade(String first, String last) {
		
		int finals, exams, assignments, i;
		int finalTotal = 0, examTotal = 0, assignmentTotal = 0;
		String grade;
		double finalD, examD, assignmentD, average;
		
		// get how many of each type of grade
		System.out.print("How many Final grades do you have? ");
		finals = in.nextInt();
		System.out.print("How many Exam grades do you have? ");
		exams = in.nextInt();
		System.out.print("How many assignments grades do you have? ");
		assignments = in.nextInt();
		
		// get all the grades
		for (i = 0; i < finals; i++) {
			System.out.print("Enter Final score: ");
			finalTotal += in.nextInt();
		}
		for (i = 0; i < exams; i++) {
			System.out.print("Enter Exam " + (i + 1) + " score: ");
			examTotal += in.nextInt();
		}
		for (i = 0; i < assignments; i++) {
			System.out.print("Enter assignment " + (i + 1) + " score: ");
			assignmentTotal += in.nextInt();
		}
		
		/*
		 * scale them and average them Exams =45% Assignments=40% Final Exam=15%
		 */

		examD = examTotal * .45;
		finalD = finalTotal * .15;
		assignmentD = assignmentTotal * .40;
		
		// average each type of grade
		examD /= exams;
		finalD /= finals;
		assignmentD /= assignments;
		
		// and get grades average
		average = examD + finalD + assignmentD;
		System.out.println("Total Score: " + average);
		
		// call getLetter to convert average to letter grade
		System.out.println(first + " " + last + " your grade is a: "
				+ getLetter(average));
	}

	public static String getLetter(double average) {
		
		/*
         * Final grades will be
		 * determined as follows:
		 * 93-100=A 80-82=B- 67-69=
		 * D+ 90-92=A- 77-79= C+
		 * 63-66= D 87-89=B+ 73-76=C
		 * 60- 62=D- 83-86=B 70-72=
		 * C- 00- 59 =F
	     */
		String grade;
		if (average >= 93)
			grade = "A";
		else if (average >= 90)
			grade = "A-";
		else if (average >= 87)
			grade = "B+";
		else if (average >= 83)
			grade = "B";
		else if (average >= 80)
			grade = "B-";
		else if (average >= 77)
			grade = "C+";
		else if (average >= 73)
			grade = "C";
		else if (average >= 70)
			grade = "C-";
		else if (average >= 67)
			grade = "D+";
		else if (average >= 63)
			grade = "D";
		else if (average >= 60)
			grade = "D-";
		else
			grade = "F";
		return grade;
	}
}