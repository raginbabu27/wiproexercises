package trainingday1;

public class PalindromeCheck {
	
	  public static void main(String[] args) {
	        String originalWord = "radar";
	        String reversedWord = "";

	        for (int i = originalWord.length() - 1; i >= 0; i--) {
	            reversedWord += originalWord.charAt(i);
	        }

	        if (originalWord.equalsIgnoreCase(reversedWord)) {
	            System.out.println("It is a palindrome.");
	        } else {
	            System.out.println("It is not a palindrome.");
	        }
	    }

}
