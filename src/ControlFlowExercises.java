public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        while (i <= 15){
//            System.out.printf("The current iteration of i is: %d%n", i);
            System.out.printf("%d ", i);
            ++i;
        }
        int a = 0;

        do{
            a += 2;
            System.out.printf("the current iteration of a is... %d.%n", a);
        }while (a < 100);
    }
}
