public class ChallengeOperators {
    public static void main(String[] args) {

        double FirstValue = 20.00d;
        double SecondValue = 80.00d;

        double addedValues = 100.00d * (FirstValue + SecondValue);

        System.out.println("myValuesTotal = " + addedValues );

        double remainder = addedValues % 40.00d;
        System.out.println("Remainder = " + remainder );

        boolean isNoRemainer = (remainder == 0.00) ? true : false;
        System.out.println("isNoRemainer = " + isNoRemainer);
        if (!isNoRemainer) {
            System.out.println("Got some remainder");
        }
    }

}
