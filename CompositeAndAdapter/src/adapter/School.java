package adapter;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }
    }
}
