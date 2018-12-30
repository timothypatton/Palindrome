
public class Palindrome {
	
	private String input;
	
	public Palindrome() {
		input = "";
	}
	
	public Palindrome(String inputString) {
		input = inputString;
	}

	public boolean testPalindrome() {
		
		String sameCase;
		String noSpaces;
		String finalVersion;
	
		sameCase = input.toLowerCase();
		noSpaces = sameCase.replaceAll(" ", "");
		finalVersion = noSpaces.replaceAll("[^A-Za-z]+", "");
		
		int length = finalVersion.length();
		String reverse = "";
		 
		for (int index = length - 1; index >= 0; index--) {
			reverse = reverse + finalVersion.charAt(index);
	      }
		
	    if(reverse.equals(finalVersion)) {
	    		return true;
	    }
	    else return false;
	}
		
}
