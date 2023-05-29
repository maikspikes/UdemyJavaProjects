import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play a game? Yes or No");

        String answer = scanner.nextLine();
        playGame(answer);

    }

    public static void playGame(String answer) {

        Boolean hasResponded = false;
        Scanner scanner = new Scanner(System.in);

        while (!hasResponded){
            if (answer.equals("yes")) {
                System.out.println("Very nice!");
                hasResponded = true;
            } else if (answer.equals("no")) {
                System.out.println("Well, maybe some other time then");
                break;
            }
            else {
                System.out.println("Invalid response. Please answer with 'Yes' or 'No'.");
                answer = scanner.nextLine();
            }
        }
    }
}
