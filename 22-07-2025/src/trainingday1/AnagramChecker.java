package trainingday1;

public class AnagramChecker {
	
	public static void main(String[] args) {
        String wordOne = "earth";
        String wordTwo = "heart";

        char[] charsOne = wordOne.toCharArray();
        char[] charsTwo = wordTwo.toCharArray();

        for (int i = 0; i < charsOne.length - 1; i++) {
            for (int j = i + 1; j < charsOne.length; j++) {
                if (charsOne[i] > charsOne[j]) {
                    char temp = charsOne[i];
                    charsOne[i] = charsOne[j];
                    charsOne[j] = temp;
                }
            }
        }

        for (int i = 0; i < charsTwo.length - 1; i++) {
            for (int j = i + 1; j < charsTwo.length; j++) {
                if (charsTwo[i] > charsTwo[j]) {
                    char temp = charsTwo[i];
                    charsTwo[i] = charsTwo[j];
                    charsTwo[j] = temp;
                }
            }
        }

        boolean isSame = true;
        if (charsOne.length != charsTwo.length) {
            isSame = false;
        } else {
            for (int i = 0; i < charsOne.length; i++) {
                if (charsOne[i] != charsTwo[i]) {
                    isSame = false;
                    break;
                }
            }
        }

        if (isSame) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

}
