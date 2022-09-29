import java.sql.SQLOutput;
import java.util.Scanner;

public class StringLecture {

    public static void main(String[] args){
        String hello = "Hello, how's it going?";
        hello = "Hello, what's you name?";
//        System.out.println(hello.concat(" And how's it going"));
        hello = hello.concat(" And how's it going");
        String str = " this is a string";
        System.out.println("I am going to concat" + " this message");
//        System.out.println(hello + str);
//        System.out.println(hello);


        String name = "Dave";
        name = "steve";
        name  = name.concat(" smith");

//        System.out.println(name);

//        String school = "codeup";
//        String schoolName = "codeup";
//
        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String input = "Yes";
//        String userInput = sc.next();

// Don't do this!
//        boolean confirmation = userInput == "y";
//        System.out.println(confirmation);

//        confirmation = userInput.equals("y");
//        System.out.println(confirmation);
//        confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);

//        System.out.println(input.startsWith(userInput));

//        String myName = "jordy";
//        String yourName = "j";
//
//        String nameValue = sc.nextLine();
//
//        if(myName.startsWith(nameValue)){
//            System.out.println("We have the same first character");
//        }else{
//            System.out.println("We don't");
//        }


        String manipulation = "     String to manipulate";

        System.out.println(manipulation.trim().charAt(0));
        System.out.println(manipulation.trim().indexOf("g"));
        System.out.println(manipulation.trim().lastIndexOf("n"));
        System.out.println(manipulation.trim().length());
        System.out.println(manipulation.trim().replace("manipulate", "change"));
        System.out.println(manipulation.trim().substring(10, 20));
        System.out.println(manipulation.trim().substring(0, 6));
        System.out.println(manipulation.trim().toLowerCase());
        System.out.println(manipulation.trim().toUpperCase());
        System.out.println(manipulation.trim().replace("manipulate", manipulation.substring(10,20).toUpperCase()));
    }
}