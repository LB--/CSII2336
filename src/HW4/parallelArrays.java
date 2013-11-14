package HW4;

import java.util.Scanner;

public class parallelArrays {
	public static void main(String[]args){
		
		//store the alphabet lower case and upper case
		char[] asciiArray = {'a','b','c','d','e','f','g','h'
				,'i','j','k','l','m','n','o','p','q','r','s',
				't','u','v','w','x','y','z','A','B','C','D','E',
				'F','G','H','I','J','K','L','M','N','O','P','Q',
				'R','S','T','U','V','W','X','Y','Z'};
		
		//store the corresponding decimal to the alphabet
	    int[] decimalArray = new int[asciiArray.length];
				
		//locate the corresponding value
	    for (int i = 0; i < asciiArray.length; i++) {
	        decimalArray[i] = (int)asciiArray[i];
	    }
	    
	    //call the method for the user input
		displayDecValue(asciiArray, decimalArray);
	}

		
		//method to display decimal value
		public static void displayDecValue(char[] asciiArray, int[] decimalArray){
			
			//take input into the system
			Scanner input = new Scanner(System.in);
	
			//ask the user for input
			System.out.println("Enter a letter value (a-z or A-Z): ");
			
			char inputChar = input.next().charAt(0);
			
			
			//sort the input of the user and find it in the arrays and display output
			   for (int i = 0; i < asciiArray.length; i++) {

		            if (inputChar == asciiArray[i]) {
		                System.out.printf("Decimal value of '" + asciiArray[i] + "' is: "
		                                   + decimalArray[0]);
		                break;
		            }

		        }
			
		}
	}
