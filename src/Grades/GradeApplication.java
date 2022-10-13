package Grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] roster = new Student[10];
        HashMap<String, HashMap<String, String>> students = new HashMap<>();

        for(int i = 0; i < 10; ++i) {
            boolean breaker = true;
            System.out.print("Enter student name(type \"n\" to exit):");
            String name = scanner.next();
            if (name.equals("no")) {
                break;
            } else {
                System.out.print("Enter grades:");
                int grade = scanner.nextInt();
                roster[i] = new Student(name, grade);
                System.out.println(roster[i].gradeAverage());
                while (true) {
                    System.out.println("Are there any more grades?");
                    String grades = scanner.next();
                    if (grades.equals("no")) {
                        break;
                    } else {
                        System.out.print("Enter grade:");
                        grade = scanner.nextInt();
                        roster[i].addGrade(grade);
                        System.out.println(roster[i].gradeAverage());
                    }
                }
            }
            HashMap<String, String> info = new HashMap<>();
            System.out.print("Enter GitHub username:");
            String username = scanner.next();
            info.put("Name", roster[i].getName());
            info.put("Current Average", String.valueOf(roster[i].gradeAverage()));
            students.put(username, info);
            System.out.println(students);
        }
    }
}
