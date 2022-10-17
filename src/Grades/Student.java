package Grades;

import java.util.ArrayList;

public class Student {
    private String name;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    private ArrayList<Integer> grades = new ArrayList<>();


    Student(String name){
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
