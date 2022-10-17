package Grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class GradesApp2 {

    public static void moreGrades(Scanner scanner, Student student) {
        System.out.println("Do you want to enter a grade? y/n:");
        String choice = scanner.nextLine();
        do {
            System.out.println("Enter grade:");
            int grade = scanner.nextInt();
            student.addGrade(grade);
            System.out.println("Would you like to add another grade? ");
            choice = scanner.nextLine();
            moreGrades(scanner, student);
        } while (choice.equalsIgnoreCase("y"));
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Student testStu = new Student("Jimmy");
//        moreGrades(scanner, testStu);
//        System.out.println(testStu.getGrades());
//        HashMap<String, Student> students = new HashMap<>();
//
////        HashMap<String, String> usernames = null;
////        HashMap<String, String> info = null;
////        for (int i = 0; i < 10; ++i) {
//        System.out.println("Do you want to enter a new student? y/n:");
//        String user_input = scanner.nextLine();
//        if (user_input.equalsIgnoreCase("y")) {
//            System.out.print("Enter student name:");
//            String name = scanner.nextLine();
//            System.out.print("Enter grade:");
//            int grade = scanner.nextInt();
//            Student newStudent = new Student(name, grade);
//            System.out.print("Enter GitHub username:");
//            String username = scanner.next();
//            students.put(username, newStudent);
//        } else {
//            System.out.println("exit");
//        }
//
//
//        roster[i] = new Student(name, grade);
//        System.out.println(roster[i].gradeAverage());
//        while (true) {
//            System.out.println("Are there any more grades?");
//            String grades = scanner.next();
//            if (grades.equals("no")) {
//                break;
//            } else {
//                System.out.print("Enter grade:");
//                grade = scanner.nextInt();
//                roster[i].addGrade(grade);
//                System.out.println(roster[i].gradeAverage());
//            }
//        }
//    }
//
//    info =new HashMap<>();
//    usernames =new HashMap<>();
//            System.out.print("Enter GitHub username:");
//    String username = scanner.next();
//            usernames.put("git",username);
//            info.put("Name",roster[i].
//
//    getName());
//            info.put("Current Average",String.valueOf(roster[i].
//
//    gradeAverage()));
//            students.put(usernames,info);
////            System.out.println(usernames.get("git"));
////            System.out.println(students.get(usernames));
//}
//        System.out.println(students);
//                for(Entry<HashMap<String, String>,HashMap<String, String>>entry:students.entrySet())
//        {
//        System.out.println(entry.getKey().);
//        }
//
//        }

    }
}