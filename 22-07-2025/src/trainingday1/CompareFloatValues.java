package trainingday1;

public class CompareFloatValues {
	
	

    public static void main(String[] args) {
        float firstNumber = 19.648f;
        float secondNumber = 19.6511f;

        int firstScaled = Math.round(firstNumber * 1000);
        int secondScaled = Math.round(secondNumber * 1000);

        if (firstScaled == secondScaled) {
            System.out.println("Numbers are equal up to three decimal places");
        } else {
            System.out.println("Numbers differ when compared to three decimal places");
        }
    }


}
