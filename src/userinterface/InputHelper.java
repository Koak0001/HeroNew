package userinterface;

import java.util.Scanner;

public class InputHelper {
    private final Scanner keyboard;
    public InputHelper(Scanner keyboard) {
        this.keyboard = keyboard;
    }
    public String promptString(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return keyboard.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                // Line break added for readability
                System.out.println();
            }
        }
    }
    public int promptInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                // Line break added for readability
                System.out.println();
            }
        }
    }
    public boolean promptBoolean(String prompt) {
        while (true) {

            try {
                System.out.println(prompt);
                String input = keyboard.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                    return true;
                } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
                    return false;
                } else {
                    System.out.println("Invalid input. Please enter 'y'/'yes' if human or 'n'/'no' if non-human.");
                    System.out.println();
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                System.out.println();
            }
        }
    }
    public double promptDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String input = keyboard.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                // Line break added for readability
                System.out.println();
            }
        }
    }
}
