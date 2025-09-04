package IT2Loops;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1. Withdraw \n 2. Deposit \n 3. Check Balance \n 4. Exit");
        do {
        System.out.print("Enter choice [1-4]");
        choice = scanner.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice");
        }
        }while (choice < 1 || choice > 4);
        switch (choice){
            case 1: {
                System.out.println("Withdrawing..");
                break;
            }
            case 2: {
                System.out.println("Depositing...");
                break;
            }
            case 3: {
                System.out.println("Checking Balance");
                break;
            }
            case 4: {
                System.out.println("Exiting..");
                break;
            }
        }
        scanner.close();
    }
}
