package service.Classes.TeacherService;

import java.util.ArrayList;
import java.util.List;

import domain.Classes.Person.PersonComparator;
import domain.Classes.Person.People.Teacher;
import service.Interfaces.iPersonService;

public class TeacherService implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher registerNewTeacher = new Teacher(firstName, secondName, age, this.count, "");
        count++;
        teachers.add(registerNewTeacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    public List<Teacher> getSortedByFIOTeacher(int groupNumber) {
        List<Teacher> newTeachersList = new ArrayList<>(teachers);
        newTeachersList.sort(new PersonComparator<Teacher>());
        return newTeachersList;
    }
    
}
