public class OverloadingMethods {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5, 18));
        System.out.println(convertToCentimeters(68));

    }


    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

    // return ((feet * 12) + inches) * 2.54;

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }

}
