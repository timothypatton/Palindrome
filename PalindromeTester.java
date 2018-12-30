
import java.util.Scanner;

public class PalindromeTester {
	
	public static void main(String[] args) {
		
		
		/* Palindrome - This program will check if a string entered by the user can be classified as a palindrome or not.
		 * 
		 * Prepare: Give a brief introduction to the program and what it will accomplish and then instruct the user to
		 * enter their word/phrase to be tested.
		 * 
		 * Input: After asking for the user to enter a word/phrase, provide a space for them to input it as a string. After the
		 * string has been processed, ask them if they would like to enter another word/phrase and provide a space for their response.
		 * Continue to run the program until they respond with no.
		 * 
		 * Process: The processing of the string that the user enters is the most complex aspect of the program. First, create a palindrome
		 * class that has two methods: one to convert the entered string into letters of the same case, without any symbols, letters, or spaces, and
		 * another class that reverses the string and compares it to itself, returning a boolean if they are equal. If it is a palindrome, the two 
		 * strings (the one entered by the user after going through the first method, and the second one that is a reverse version of the first string,
		 * will both be equivalent. Then, the program should output the result and ask the user if they would like to test another word/phrase.
		 * 
		 * Output: Inform the user as to whether or not the word/phrase they entered is a palindrome. Then, ask them if they would like to
		 * test another word/phrase. */
		
		
		String response = "yes";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Palindrome Tester Program!");
		
		while(response.equalsIgnoreCase("yes")) {
		
		String input;
		Palindrome test;
		boolean isPalindrome;
	
		System.out.println("Please enter a word or phrase to be tested:");
		
		input = keyboard.nextLine();
		test = new Palindrome(input);
		
		isPalindrome = test.testPalindrome();
	
		if (isPalindrome) {
			System.out.println("Yes! The word/phrase you have entered is a palindrome.");
		}
		else System.out.println("No. The word/phrase you have entered is not a palindrome.");
		
		System.out.println("Would you like to preform another test? Please enter yes or no:");
		response = keyboard.nextLine();
		}

		keyboard.close();
	
	}
}

