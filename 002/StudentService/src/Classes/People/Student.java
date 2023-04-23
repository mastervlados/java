package Classes.People;

import Classes.Person;

public class Student extends Person implements Comparable<Student> {
    private long studentID;

    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return String.format("Student [ID:%d]: %s %s, %d y.o.", studentID, firstName, secondName, age);
    }

    @Override
    public int compareTo(Student o) {
         if(super.getAge() == o.getAge()) {
            if(this.studentID == o.studentID) {
                return 0;
            } else if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
         } 
         if(super.getAge() < o.getAge()) {
            return -1;
         }   
         return 1;
    }
}
