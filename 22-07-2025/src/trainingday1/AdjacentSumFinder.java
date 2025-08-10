package trainingday1;

public class AdjacentSumFinder {
       
	
	 public static void main(String[] args) {
	        int[] numbers = {4, 9, 6, 8};
	        int sumTarget = 15;
	        int[] resultIndexes = {0, 0};

	        for (int idx = 0; idx < numbers.length - 1; idx++) {
	            if (numbers[idx] + numbers[idx + 1] == sumTarget) {
	                resultIndexes[0] = idx;
	                resultIndexes[1] = idx + 1;
	            }
	        }

	        System.out.println(resultIndexes[0] + " " + resultIndexes[1]);
	    }
}
