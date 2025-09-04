package IT3Array;

import java.util.Scanner;

public class otherMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfQuiz = scanner.nextInt();
        int total = 0;
        int[] scores = new int[numberOfQuiz];
        for (int i = 0; i < numberOfQuiz; i++){
            System.out.print("Enter score for quiz: " + (i +1) + ": ");
            scores [i] = scanner.nextInt();
            total += scores[i];

        }
        System.out.println("Total = " + total);
        scanner.close();
    }
}
