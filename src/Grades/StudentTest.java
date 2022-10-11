package Grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("malik", 99 );
        System.out.println(student1.getName());
        student1.addGrade(97);
        student1.addGrade(30);
        System.out.println( student1.gradeAverage());

    }
}
