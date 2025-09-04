package IT2Loops;
import java.util.Scanner;
public class Excercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {System.out.println();
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        } while (number < 0);
for (int i = 0; /* sisnce you want it to repeat 10 time*/ i < 10; i++){
    int product = number * (i +1);
    System.out.println(number + " x " +(i + 1) + " = "+ product);
}
    }
}
