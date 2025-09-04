package IT2Loops;
import java.util.Scanner;
public class Try {
    public static void main(String[] args) {
        // user input 3 scores. Find total and average
        Scanner scanner = new Scanner(System.in);
        int score, total = 0;
        double average;
        int numberOfQuizzes;
        System.out.print("Enter number of quizzes: ");
        numberOfQuizzes = scanner.nextInt();

        for (int a = 0; a < numberOfQuizzes; a++){
            do{
                System.out.print("Enter score for quiz " + (1+a) + ": ");
                score = scanner.nextInt();
                if (score < 0|| score > 100){
                    System.out.println("Enter a score between 0-100.");
                }
            }while (score < 0|| score > 100);
            total = total +score;
            //First iteration: Total = 0 + 99
            //2nd iteration total = 99 + 100
            // 3rd 199 + 95
        }
        System.out.println("Your total is: " +total);
        average = total/numberOfQuizzes;
        System.out.printf("Average = %.2f" ,average);
        scanner.close();
    }
}
