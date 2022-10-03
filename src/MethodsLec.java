import java.util.Scanner;

public class MethodsLec {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("{{{Calculator}}} Lets add two numbers!!!");
        System.out.println("What is your first number?");
        num1 = scanner.nextInt();
        System.out.println("What is your second number?");
        num2 = scanner.nextInt();
        System.out.println("Your answer is ....");
        System.out.println(add(num1, num2));
        System.out.println(getPassword());
        System.out.println(isLoggedIn());
        System.out.println(checkBalance());
        soutMessage();
        System.out.println(multiply(3, 6));
    }
//    public static int add(){
//        int num1 = 1;
//        int num2 = 2;
//        return num1 + num2;
//    }
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static String getPassword(){
        return "Password";
    }
    public static boolean isLoggedIn(){
        return true;
    }
    public static double checkBalance(){
        return 1.40;
    }
    public static void soutMessage(){
        System.out.println("This is a sout");
    }
    public static double multiply(double number_1, double number_2){
        double results;
        results =  number_1 * number_2;
        System.out.printf("% x %i",number_1, number_2);
        return results;
    }
//    public static String food(String apple, String orange){
//
//    }
}
