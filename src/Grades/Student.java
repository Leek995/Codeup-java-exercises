package Grades;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades = new ArrayList<>();
    int grade;

    Student(String name, int grade){
        this.grade = grade;
        grades.add(grade);
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double gradeAverage(){
        double holder = 0;
        int count = 0;
        for(int i : grades){
            holder += i;
            count += 1;
        }
        return holder / count;
    }
}
