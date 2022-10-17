//package Grades;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Map.Entry;
//
//public class GradeApplication {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        Student[] roster = new Student[10];
//        HashMap<HashMap<String, String>, HashMap<String, String>> students = new HashMap<>();
//
//        HashMap<String, String> usernames = null;
//        HashMap<String, String> info = null;
//        for (int i = 0; i < 10; ++i) {
//
//            System.out.print("Enter student name(type \"n\" to exit):");
//            String name = scanner.next();
//            if (name.equals("no")) {
//                break;
//            } else {
//                System.out.print("Enter grades:");
//                int grade = scanner.nextInt();
//                roster[i] = new Student(name, grade);
//                System.out.println(roster[i].gradeAverage());
//                while (true) {
//                    System.out.println("Are there any more grades?");
//                    String grades = scanner.next();
//                    if (grades.equals("no")) {
//                        break;
//                    } else {
//                        System.out.print("Enter grade:");
//                        grade = scanner.nextInt();
//                        roster[i].addGrade(grade);
//                        System.out.println(roster[i].gradeAverage());
//                    }
//                }
//            }
//            info = new HashMap<>();
//            usernames = new HashMap<>();
//            System.out.print("Enter GitHub username:");
//            String username = scanner.next();
//            usernames.put("git", username);
//            info.put("Name", roster[i].getName());
//            info.put("Current Average", String.valueOf(roster[i].gradeAverage()));
//            students.put(usernames, info);
////            System.out.println(usernames.get("git"));
////            System.out.println(students.get(usernames));
//        }
//        System.out.println(students);
//        for(Entry <HashMap<String, String>, HashMap<String, String>> entry : students.entrySet())
//        {
//            System.out.println(entry.getKey().);
//        }
//
//    }
//
//}
