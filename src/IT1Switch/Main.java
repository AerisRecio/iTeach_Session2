package IT1Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String subject;
        System.out.println("What is your favorite subject: ");
        subject = scanner.nextLine();
        switch (subject) {
            case "math": {
                System.out.println("Your favorite subject is Math");
                break;
            }
            case "science": {
                System.out.println("Your favorite subject is Science");
                break;
            }
            case "english": {
                System.out.println("Your favorite subject is English");
                break;
            }
            default: {
                System.out.println("Invalid Subject");
            }
            scanner.close();
        }
    }
}
