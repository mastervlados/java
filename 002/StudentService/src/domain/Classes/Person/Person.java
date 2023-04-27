package domain.Classes.Person;

public class Person {
    /** Person name */
    protected String firstName;
    /** Person surename */
    protected String secondName;
    /** Person age */
    protected int age;

    /**
     * Person constructor:
     * 
     * @param firstName  String
     * @param secondName String
     * @param age        int
     */
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /**
     * Get First Name
     * 
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set First Name
     * 
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get Second Name
     * 
     * @return String
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Set Second Name
     * 
     * @param secondName String
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Get Person Age
     * 
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * Set Person Age
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person: %s %s, %d y.o.", firstName, secondName, age);
    }
}
