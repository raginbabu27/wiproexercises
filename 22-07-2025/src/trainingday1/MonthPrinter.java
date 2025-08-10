package trainingday1;

public class MonthPrinter {
	
	

    enum SeasonMonth {
        JAN, FEB, MAR, APR,
        MAY, JUN, JUL, AUG,
        SEP, OCT, NOV, DEC
    }

    public static void main(String[] args) {
        for (SeasonMonth monthItem : SeasonMonth.values()) {
            System.out.println(monthItem);
        }

        SeasonMonth selectedMonth = SeasonMonth.MAR;
        if (selectedMonth == SeasonMonth.MAR) {
            System.out.println("The month is MARCH.");
        } else {
            System.out.println("The month is not MARCH.");
        }
    }

}
