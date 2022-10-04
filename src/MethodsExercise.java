import java.util.Scanner;
public class MethodsExercise {
    public static void main(String[] args){
//        System.out.println(addition(3, 5));
//        System.out.println(subtraction(3,5));
//        System.out.println(multiplication(5,5));
//        System.out.println(division(5, 5));
//        System.out.println(modulus(3, 5));
        getInteger(1,10);

    }
//    public static int addition(int number_1, int number_2){
//        return number_1 + number_2;
//    }
//    public static int subtraction(int number_1, int number_2){
//        return number_1 - number_2;
//    }
//    public static int multiplication(int number_1, int number_2){
//        int results = 0;
//        // Multiplication using for loop
//        for(int i = 0; i < number_2; ++i){
//            results += number_1;
//        }
//        return results;
//        results += number_1;
//        if(number_2 == 0){
//            System.exit(0);
//        }else {
//            multiplication(number_1, (number_2 - 1));
//        }
//        return results;
//        results += number_1;
//        if(number_2 == 0){
//            System.exit(0);
//        }else {
//            number_2 = number_2 - 1;
//            multiplication(number_1, number_2);
//        }
//        return results;
//
//    }
//    public static double division(double number_1, double number_2) {
//        double results = 0;
//        if (number_2 == 0) {
//            System.out.println("Not a number!");
//            System.exit(0);
//        } else {
//            results = number_1 / number_2;
//        }
//        return results;
//    }
//    public static int modulus(int number_1, int number_2) {
//        return number_1 % number_2;
//    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number.");
        int userInput = scanner.nextInt();
        if(max == 0){
            System.out.println("Correct");
        }
        else{
            getInteger(min, max -1);
        }
        return userInput;
    }




}
