package IT2Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*counter controls loops to avoid infinite loops
        int counter = 0;
        counter = counter +1;
        System.out.println(counter);
        counter += 1;
        System.out.println(counter);
        counter ++;
        ++ to increase
        -- to decrease
        System.out.println(counter);
        //LOOPS
        // Loops are used to repeat a block of code multiple times.
        int num = 10;
        while (num >= 1){
        System.out.println(num);
        num--;
        }*/
        /*While loop check condition before running code
        To prevent user to not enter a name

        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (name.isEmpty()){
                System.out.println("Please enter a name.");
            }
        }
        System.out.println("Welcome " + name);
    }
    close.scanner();*/
        // do while loops - validating inputs
        Scanner scanner = new Scanner(System.in);
        int grade;
        do {
            System.out.print("Enter your grade: ");
            grade = scanner.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("Input a grade between 0-100");
            }
        } while (grade < 0 || grade > 100);
        System.out.println("Your grade is: " + grade);
    }
}
