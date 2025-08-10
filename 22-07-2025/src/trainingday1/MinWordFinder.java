package trainingday1;

public class MinWordFinder {
	
	   public static void main(String[] args) {
	        String sentence = "Java practice improves problem solving";
	        String[] tokens = sentence.split(" ");
	        String minWord = tokens[0];

	        for (String term : tokens) {
	            if (term.length() < minWord.length()) {
	                minWord = term;
	            }
	        }

	        System.out.println("Shortest word: " + minWord);
	    }

}

