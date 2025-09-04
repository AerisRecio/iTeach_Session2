package IT3Array;
import java. util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array fix amount of number of the same type
        //String studentName1,studentname2,studentname3,;
       // String[] studentNames= new String [50];
        //instead of making 50 variable names, yan nalanag.
        //int [] numbers = new int[10];
        // type of declaring arrays
        // 1. implicit declaration
        String [] fruits = {"apple", "banana", "mango", "pineapple"};
        System.out.println("Length of fruit array#1: " +fruits.length);
        //2. Explicit declaration
        String [] fruits2 = new String [4];
        System.out.println("Length of fruit array#3: " +fruits2.length);
        // Question, use input number or arrays.
        //3. User defined
        int numberOfFruits;
        System.out.print("Enter number of fruits: ");
        numberOfFruits = scanner.nextInt();
        String[] fruits3 = new String[numberOfFruits]  ;
        System.out.println("Length of fruit array#3: " +fruits3.length);
        /*System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        scanner.close();*/
        for (int i = 0; i < fruits.length; i++){
        System.out.println(fruits[i]);}
    }
}
