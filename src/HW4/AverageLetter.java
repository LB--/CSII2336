package HW4;

import java.util.*;

public class AverageLetter {
	
	public static int getAverage(char[] ascii, int[] decimal) {
		
		/* determine the decimal value of each of the letters in the 5 elements 
		 * array with the help of the two parallel arrays, asciiArray and decimalArray 
		 * using their corresponding positions.*/
		int sum = 0;
		for (int i = 0; i < ascii.length; i++) {
			sum = sum + decimal[i];
		}
		return sum / ascii.length;
	} // end method

	public static void main(String[] args) {
		
		//create arrays and take in input
		char[] letterArray = new char[5];
		int[] DecimalArray = new int[5];
		Scanner in = new Scanner(System.in);
		
		//sort the input of the user and find it in the arrays
		int max = 0;
		for (int i = 0; i < letterArray.length; i++) {
			System.out.println("Enter letter " + (i + 1));
			letterArray[i] = in.next().charAt(0);
			DecimalArray[i] = (int) (letterArray[i]);
			
			if (DecimalArray[i] > max)
				max = DecimalArray[i];
		}
		
		//display output
		System.out.println("Average of all letters is : "
				+ getAverage(letterArray, DecimalArray)
				+ " and the letter with highest value is " + (char) (max));
	} // end main
} // end class