package service.Classes;

import java.util.ArrayList;
import java.util.List;

import domain.Classes.Person.PersonComparator;
import domain.Classes.Person.People.Student;
import domain.Classes.StudentGroup.StudentGroup;

public class StudentGroupService {
    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<StudentGroup>();
    }

    public List<StudentGroup> getAll() {
        return groups;
    }

    public List<Student> getSortedByFIOStudentGroup(int groupNumber) {
        List<Student> students = new ArrayList<>(groups.get(groupNumber).getStudents());
        students.sort(new PersonComparator<Student>());
        return students;
    }
}
