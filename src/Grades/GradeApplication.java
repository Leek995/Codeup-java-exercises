package Grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] roster = new Student[10];
        HashMap<String, HashMap<String, String>> students = new HashMap<>();
        HashMap<String, String> info = new HashMap<>();
        for(int i = 0; i < 10; ++i){
            boolean breaker = true;
            System.out.print("Enter student name(type \"n\" to exit):");
            String name = scanner.next();
            if (name.equals("no")){
                break;
            }else {
                System.out.print("Enter grades:");
                int grade = scanner.nextInt();
                roster[i] = new Student(name, grade);
                do {
                    System.out.println("Are there any more grades?");
                    String grades = scanner.next();
                    if(grades.equals( "yes")){
                        System.out.print("Enter grade:");
                        grade = scanner.nextInt();
                        roster[i].addGrade(grade);
                    } else if (grades.equals("no")) {
                        System.out.print("Enter GitHub username:");
                        String username = scanner.next();
                        students.put(username, info);
                        info.put("Name", roster[i].getName());
                        info.put("Current Average", String.valueOf(roster[i].gradeAverage()));
                        breaker = false;
                    }

                }while(breaker);
            }

        }
        System.out.println(students);
        for (int i = 0; i < students.size(); ++i){
            students.get(roster[i].name);
        }


//        boolean breaker =true;
//        do{
//
//        }while (true);


//
//        Student student2 = new Student("henry", 26);
//        Student student3 = new Student("megan", 3);


//
//        students.put("Jako", student1);
//        students.put("Henryo", student2);
//        students.put("Mego", student3);
//        System.out.println(students.size());
//        System.out.println(student1.getName());

//        for(int i = 0; i < students.size(); ++i){
//            students.put(name,)
//        }

    }
}
