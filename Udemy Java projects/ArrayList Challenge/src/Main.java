import com.sun.jdi.connect.AttachingConnector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        items.add("banana");
        items.add("Peer");


        System.out.printf("Available actions:%n" +
                "0- to shutdown %n" +
                "1- to add item(s) to list (comma delimited list)%n" +
                "2- to remove any items (comma delimited list)%n");

        System.out.printf("Enter a number for which you want to do:%n" + ("-").repeat(20) + "%n");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 0:
                System.out.println("Shutting down...");
                break;
            case 1:
                System.out.println("Enter the item you want to add");
                scanner.nextLine();
                String addInput = scanner.nextLine();
                List<String> addItems = Arrays.asList(addInput.split("\\s*,\\s*"));
                items.addAll(addItems);
                for (String item : addItems) {
                    if (!items.contains(item)) {
                        items.add(item);
                        System.out.println("Item added: " + item);
                    } else {
                        System.out.println("Item already exists: " + item);
                        System.out.println("Please add another item: ");
//                        scanner.nextLine();

                    }
                }
                break;

            case 2:
                System.out.println("Enter the item you want to remove");
                scanner.nextLine();
                String removeInput = scanner.nextLine();
                List<String> removeItems = Arrays.asList(removeInput.split("\\s*,\\s*"));
                items.removeAll(removeItems);
                System.out.println("Items removed: " + removeItems);
                break;

            default:
                System.out.println("Invalid action!");

        }
        System.out.println("Updated items: " + items);

    }
}
