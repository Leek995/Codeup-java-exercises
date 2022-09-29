import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        int loopNum = 5;
        while(loopNum <= 15) {
            System.out.print(loopNum + " ");
            loopNum++;
        }

        loopNum = 0;

        do {
            System.out.println(loopNum);
            loopNum += 2;
        } while (loopNum <= 100);

        loopNum = 100;

        do {
            System.out.println(loopNum);
            loopNum -= 5;
        } while (loopNum >= -10);

        long longNum = 2;
        do {
            System.out.println(longNum);
            longNum *= longNum;
        } while (longNum < 1000000);

        for (long i = 2; i < 1000000; i*=i) {
            System.out.println(i);
        }

        for (int num = 1; num <=100; num++) {
            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(num);
            }
        }

        boolean keepGoing;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            int userNum = scanner.nextInt();

            System.out.println("Number | Squared | Cubed");
            System.out.println("------------------------");
            for (int i = 1; i <= userNum; i++) {
                System.out.printf("%d | %d | %d%n", i, i * i, i * i * i);
            }
            scanner.nextLine();
            System.out.println("Would you like to do yet more math?");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("yes")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        }  while (keepGoing);

        do {
            System.out.println("Enter a number:");
            int userNum = scanner.nextInt();

            if (userNum >= 88 && userNum <=100) {
                System.out.println("You got an A!");
            } else if (userNum <= 87 && userNum >= 80) {
                System.out.println("You got a B!");
            } else if (userNum <= 79 && userNum >= 67) {
                System.out.println("You got a C!");
            } else if (userNum <= 66 && userNum >= 60) {
                System.out.println("You got a D!");
            } else {
                System.out.println("You got an F!");
            }

            scanner.nextLine();
            System.out.println("Would you like to look at more grades?");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        } while (keepGoing == true);
    }
}