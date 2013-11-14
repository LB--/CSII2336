package HW4;

import java.util.*;

import java.lang.*;

import java.io.*;

class CSE1341Grad {

	public static int[] getScores(int[] exams, int[] finals, int[] assignments)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("How many Finals? ");

		int f = new Integer(scan.nextLine());

		System.out.println("How many Exams? ");

		int e = new Integer(scan.nextLine());

		System.out.println("How many Assignments? ");

		int a = new Integer(scan.nextLine());

		int countArray[] = new int[3];

		countArray[0] = f;

		countArray[1] = e;

		countArray[2] = a;

		int i = 0;

		while (f != 0)

		{

			System.out.println("Enter Final Grade: ");

			finals[i] = new Integer(scan.nextLine());

			i++;

			f--;

		}

		i = 0;

		while (e != 0)

		{

			System.out.println("Enter Exam Grade: ");

			exams[i] = new Integer(scan.nextLine());

			i++;

			e--;

		}

		i = 0;

		while (a != 0)

		{

			System.out.println("Enter Assignment Grade: ");

			assignments[i] = new Integer(scan.nextLine());

			i++;

			a--;

		}

		return countArray;

	}

	public static void calcGrage(String first, String last)

	{

		int exams[] = new int[100];

		int finals[] = new int[100];

		int assignments[] = new int[100];

		int temp = 0;

		while (temp < 100)

		{

			exams[temp] = -1;

			finals[temp] = -1;

			assignments[temp] = -1;

			temp++;

		}

		int scores[] = getScores(exams, finals, assignments);

		Double Exam = 0.0, Final = 0.0, Assignment = 0.0;

		int i = 0;

		while (i < scores[1])

		{

			Exam += exams[i];

			i++;

		}

		Exam = Exam / scores[1];

		i = 0;

		while (i < scores[0])

		{

			Final += finals[i];

			i++;

		}

		Final = Final / scores[0];

		i = 0;

		while (i < scores[2])

		{

			Assignment += assignments[i];

			i++;

		}

		Assignment = Assignment / scores[2];

		Double total = (45 * Exam) / 100 + (40 * Assignment) / 100
				+ (15 * Final) / 100;

		String grade;

		System.out.println("Average Grade is : " + total);

		if (93 <= total && total <= 100)

			grade = "A";

		else if (90 <= total && total <= 92)

			grade = "A-";

		else if (87 <= total && total <= 89)

			grade = "B+";

		else if (83 <= total && total <= 86)

			grade = "B";

		else if (80 <= total && total <= 82)

			grade = "B-";

		else if (77 <= total && total <= 79)

			grade = "C+";

		else if (73 <= total && total <= 76)

			grade = "C";

		else if (70 <= total && total <= 72)

			grade = "C-";

		else if (67 <= total && total <= 69)

			grade = "D+";

		else if (63 <= total && total <= 66)

			grade = "D";

		else if (60 <= total && total <= 62)

			grade = "D-";

		else

			grade = "F";

		System.out.println(first + " " + last + " your letter Grade is : "
				+ grade);

	}

	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Name: ");

		String first = scan.nextLine();

		System.out.println("Enter Last Name: ");

		String last = scan.nextLine();

		calcGrage(first, last);

	}

}