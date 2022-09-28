import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        System.out.println(userNumber);

        System.out.println("Enter three (3) words: ");
        String first_word, second_word, third_word;
        first_word = scanner.next();
        second_word = scanner.next();
        third_word = scanner.next();
        System.out.printf( "%s%n%s%n%s%n", first_word, second_word, third_word);
    }
}
