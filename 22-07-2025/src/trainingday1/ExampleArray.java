package trainingday1;

public class ExampleArray {
	
	
	
	public static void main(String[] args) {
        int[] scores = {5, 8, 2, 11, 7, 3};

        for (int a = 0; a < scores.length; a++) {
            scores[a] *= 2;
        }

        for (int b = 0; b < scores.length; b++) {
            System.out.print(scores[b] + " ");
        }
    }

}
