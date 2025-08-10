package trainingday1;

public class UniqeElements {
	
	
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};

        if (numbers.length == 0) {
            System.out.println("No elements");
            return;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[uniqueIndex]) {
                uniqueIndex++;
                numbers[uniqueIndex] = numbers[i]; // fixed from arr[j+1] to arr[j]
            }
        }

        System.out.print("Unique elements: ");
        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Count: " + (uniqueIndex + 1));
    }

}
