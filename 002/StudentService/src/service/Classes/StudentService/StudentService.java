package service.Classes.StudentService;

import java.util.ArrayList;
import java.util.List;

import domain.Classes.Person.People.Student;
import service.Interfaces.iPersonService;

public class StudentService implements iPersonService<Student> {

    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student registerNewStudent = new Student(firstName, secondName, age, this.count);
        count++;
        students.add(registerNewStudent);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }  
}
