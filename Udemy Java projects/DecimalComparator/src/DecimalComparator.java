public class DecimalComparator {
    public static void main(String[] args) {

    }


    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {

        int scaledNumber1 = (int) (num1 * 1000);
        int scaledNumber2 = (int) (num2 * 1000);

        return scaledNumber1 == scaledNumber2;


    }
}
