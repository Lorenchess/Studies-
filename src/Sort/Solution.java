package Sort;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        int numberOfStudents = sc.nextInt();


        List<Student> studentsList = new ArrayList<>();
        while(numberOfStudents > 0){
            System.out.println("id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("firstName");
            String firstName = sc.nextLine();
            System.out.println("cgpa");
            double cgpa = sc.nextDouble();
            studentsList.add(new Student(id, firstName, cgpa));
            numberOfStudents--;
        }
        Collections.sort(studentsList, Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFirstName)
                .thenComparing(Student::getId));

        for (Student student : studentsList) {
            System.out.println(student.getFirstName());
        }

    }
}
class Student {

    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }

}
