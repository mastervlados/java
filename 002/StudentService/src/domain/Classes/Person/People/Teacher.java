package domain.Classes.Person.People;

import domain.Classes.Person.Person;

public class Teacher extends Person {
    /** Teacher ID */
    private long teacherID;
    /** Teacher does a subject */
    private String subject;

    /**
     * Teacher constructor:
     * 
     * @param firstName  String
     * @param secondName String
     * @param age        int
     * @param teacherID  long
     * @param subject    String
     */
    public Teacher(String firstName, String secondName, int age, long teacherID, String subject) {
        super(firstName, secondName, age);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    /**
     * Get Teacher ID
     * 
     * @return long
     */
    public long getTeacherID() {
        return teacherID;
    }

    /**
     * Get Subject
     * 
     * @return String
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Set Subject for this Teacher
     * 
     * @param subject String
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("Teacher [ID:%d]: %s %s, %d y.o., does %s", teacherID, firstName, secondName, age,
                subject);
    }

}
