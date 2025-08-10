package trainingday1;

public class MaxFinder {     
	
	
	 public static void main(String[] args) {
	        int[] values = {85, 42, 199, 305, 76, 150};
	        
	        int largestValue = Integer.MIN_VALUE;

	        for (int val : values) {
	            if (val > largestValue) {
	                largestValue = val;
	            }
	        }

	        System.out.println("Largest Number: " + largestValue);
	    }

}
