import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String name = "Jim";
        int age = 66;
        System.out.printf("Hello there, %s. Nice to see you.%n", name);
        System.out.format("Hello my name is %s. I'm %d years old %n", name, age);
        System.out.print("Hello my name is" + name + ".\n");
        float percent = 99.99F;
        System.out.printf("Hello my name is %s. I'm %d years old. Im %.2f%% percent sure im the best.",name, age, percent);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Gimme a string");
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        System.out.println("What is you favorite number?");
        int favoriteNumber = scanner.nextInt();
        System.out.println(favoriteNumber);

        scanner.nextLine();
        System.out.println("What is your favorite color?");
        String favColor = scanner.nextLine();
        System.out.println(favColor);
    }
}
