import java.util.Scanner;

public class MinMaxMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double minNumber = 0;
        double maxNumber = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("put a number in, or a character to exit the loop");
            String nextEntry = scanner.nextLine();
            try {
                double validNumber = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNumber < minNumber){
                    minNumber = validNumber;
                }
                if (loopCount == 0 || validNumber > maxNumber){
                    maxNumber = validNumber;
                }
                loopCount++;
            } catch (NumberFormatException nfe){
                break;
            }
        }
        if (loopCount > 0){
            System.out.println("min = " + minNumber + ", max = " + maxNumber);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
