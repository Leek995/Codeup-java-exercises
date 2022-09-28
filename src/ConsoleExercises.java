import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f %n", pi);
//
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        System.out.println(userNumber);
//
        scanner.nextLine();
//        System.out.println("Enter three (3) words: ");
//        String first_word, second_word, third_word;
//        first_word = scanner.next();
//        second_word = scanner.next();
//        third_word = scanner.next();
//        System.out.printf( "%s%n%s%n%s%n", first_word, second_word, third_word);

        System.out.println("Enter a sentence:");
        String userSentence = scanner.next();
        System.out.println(userSentence);

        scanner.nextLine();
        System.out.println("What is the length of the classroom");
        System.out.println("What is the length?");
        int length = scanner.nextInt();
        System.out.println("What is the width?");
        int width = scanner.nextInt();
        int perimeter, area;
        area = length * width;
        perimeter = (length * 2) + width * 2;
        System.out.printf("The perimeter of codeup's classroom is %d.%n", perimeter);
        System.out.printf("The area of codeup's classroom is %d.%n", area);


    }
}
