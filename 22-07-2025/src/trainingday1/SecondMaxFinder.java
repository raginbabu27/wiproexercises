package trainingday1;

public class SecondMaxFinder {
	
	
	 public static void main(String[] args) {
	        int[] scores = {12, 7, 25, 9, 18};

	        int largest, secondLargest;

	        if (scores[0] > scores[1]) {
	            largest = scores[0];
	            secondLargest = scores[1];
	        } else {
	            largest = scores[1];
	            secondLargest = scores[0];
	        }

	        for (int i = 2; i < scores.length; i++) {
	            if (scores[i] > largest) {
	                secondLargest = largest;
	                largest = scores[i];
	            } else if (scores[i] > secondLargest && scores[i] != largest) {
	                secondLargest = scores[i];
	            }
	        }

	        System.out.println("Second largest value: " + secondLargest);
	    }

}
