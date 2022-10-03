public class MethodsExercise {
    public static void main(String[] args){
        System.out.println(addition(3, 5));
        System.out.println(subtraction(3,5));
        System.out.println(multiplication(3,5));
        System.out.println(division(3, 5));
    }
    public static int addition(int number_1, int number_2){
        return number_1 + number_2;
    }
    public static int subtraction(int number_1, int number_2){
        return number_1 - number_2;
    }
    public static int multiplication(int number_1, int number_2){
        return number_1 * number_2;
    }
    public static int division(int number_1, int number_2){
        return number_1 / number_2;
    }
}
