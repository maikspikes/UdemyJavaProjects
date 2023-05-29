public class SwitchChallenge {
    public static void main(String[] args) {

        char letter = 'Y';

        switch (letter) {
            case 'A' -> System.out.println(letter + " Able");
            case 'B' -> System.out.println(letter + " Baker");
            case 'C' -> System.out.println(letter + " Charlie");
            case 'D' -> System.out.println(letter + " Dog");
            case 'E' -> System.out.println(letter + " Easy");
            default -> System.out.println(letter + " was not found");

        }


    }
}

