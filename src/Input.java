import java.util.Scanner;

public class Input {
    private double input;

    Input(double input){
        this.input = input;
    }
    public double getDouble(){
        return input;
    }
    public int getInt(){
        return (int) input;
    }
//    public String getString(){
//        return input;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first_input = scanner.nextDouble();

        Input Input1 = new Input(first_input);
        System.out.println(Input1.getDouble());
    }
}
