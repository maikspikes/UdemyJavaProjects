package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import dev.lpa.methods;

public class nextMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            methods.printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> methods.addItems(groceries);
                case 2 -> methods.removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

}

