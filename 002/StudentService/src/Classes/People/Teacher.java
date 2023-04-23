package Classes.People;

import Classes.Person;

public class Teacher extends Person {
    private long teacherID;
    private String subject;

    public Teacher(String firstName, String secondName, int age, long teacherID, String subject) {
        super(firstName, secondName, age);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    public long getTeacherID() {
        return teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("Teacher [ID:%d]: %s %s, %d y.o., does %s", teacherID, firstName, secondName, age, subject);
    }
    
}
