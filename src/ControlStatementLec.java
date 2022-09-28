import java.util.Scanner;
public class ControlStatementLec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if(userNum == 5){
            System.out.println("Hey, 5 is a heckin' cool number.");
        } else {
            System.out.println("Man, I really wish you've said 5.");
        }
//        switch (userNum){
//            case 5:
//                System.out.println("Wicked, I love 5.");
//                break;
//            default:
//                System.out.println("Bummer, I really like 5.");
//        }
        String str = (false) ? "Wow" : "Aw";

        sc.nextLine();
        String food = sc.nextLine();
        String side = sc.nextLine();
        if(food.equals("Nuggest") && side.equals("Fries")){
            System.out.println("Alright, completed order!");
        } else {

        }
    }
}
