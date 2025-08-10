package trainingday1;

public class LetterCounter {
        
	
	  public static void main(String[] args) {
	        String word = "RaghuVendra";
	        int vowelCount = 0;
	        int consonantCount = 0;

	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);

	            if (ch >= 'A' && ch <= 'Z') {
	                ch = (char) (ch + 32);
	            }

	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	            } else {
	                consonantCount++;
	            }
	        }

	        System.out.println("Vowels: " + vowelCount);
	        System.out.println("Consonants: " + consonantCount);
	    }
}
