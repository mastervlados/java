package domain.Classes.Person.People;

import domain.Classes.Person.Person;

public class Student extends Person implements Comparable<Student> {
    /** Student ID */
    private long studentID;

    /**
     * Student constructor:
     * 
     * @param firstName  String
     * @param secondName String
     * @param age        String
     * @param studentID  long
     */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    /**
     * Get Student ID
     * 
     * @return long
     */
    public long getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return String.format("Student [ID:%d]: %s %s, %d y.o.", studentID, firstName, secondName, age);
    }

    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            } else if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}
