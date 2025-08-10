package trainingday1;

public class ShapeIdentifier {
	

    public static void main(String[] args) {
        char figureCode = 'T';

        switch (figureCode) {
            case 'T':
                System.out.println("Triangle");
                break;
            case 'O':
                System.out.println("Oval");
                break;
            case 'H':
                System.out.println("Hexagon");
                break;
            default:
                System.out.println("Invalid shape code entered");
        }
    }
	    

}
