package domain.Classes.StudentGroup;

import java.util.Iterator;
import java.util.List;

import domain.Classes.Person.People.Student;

public class StudentGroup implements Iterable<Student> {
    private long groupID = 100;
    private String groupName;
    private List<Student> students; 

    public StudentGroup(List<Student> students, String groupName, long id) {
        this.groupID = id;
        this.groupName = groupName;
        this.students = students;
    }

    public long getGroupID() {
        return groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudentToGroup(Student student) {
        this.students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < students.size();
            }
            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                /**
                 * Post-prefix
                 * get student by index and after increase
                 */
                return students.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        System.out.printf("Group #%d %s\n", this.groupID, this.groupName);
        for (Student student : students) {
            System.out.println(student);
        }
        return String.format("> Count of members: %d\n", students.size());
    }
}
