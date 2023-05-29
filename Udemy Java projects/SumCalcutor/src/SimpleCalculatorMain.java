import java.util.Scanner;

public class SimpleCalculatorMain {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your first number here");
        simpleCalculator.setFirstNumber(scanner.nextDouble());
        System.out.println("Insert your second number here");
        simpleCalculator.setSecondNumber(scanner.nextDouble());

        System.out.println("add= " + simpleCalculator.getAdditionResult());

    }

}
