import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        boolean convo = true;
       do{
           System.out.println("Say something to Bob!");
           Scanner scanner = new Scanner(System.in);
           String small_talk = scanner.nextLine();
           // for question mark
           if(small_talk.endsWith("!")){
               System.out.println("Sure.");
               //for exclamation mark
           }else if(small_talk.endsWith("?")){
               System.out.println("Whoa, chill out!");
               // for uppercase
           }else if(small_talk.equals(small_talk.toUpperCase())){
               System.out.println("Fine. Be that way!");
           }else {
               System.out.println("Whatever.");
           }
           System.out.println("Would you like to continue talking to Bob [Y/N]?");
           String userInput = scanner.nextLine();
           if(userInput.equalsIgnoreCase("y")){
               convo = true;
           } else if (userInput.equalsIgnoreCase("n")) {
               convo = false;
           }
       }while (convo == true);

    }
}
