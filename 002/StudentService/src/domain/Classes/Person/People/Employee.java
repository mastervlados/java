package domain.Classes.Person.People;

import domain.Classes.Person.Person;

public class Employee extends Person {
    /** Employee ID */
    private long employeeID;

    /**
     * new Employee constructor
     * 
     * @param firstName  String
     * @param secondName String
     * @param age        int
     * @param employeeID long
     */
    public Employee(String firstName, String secondName, int age, long employeeID) {
        super(firstName, secondName, age);
        this.employeeID = employeeID;
    }

    /**
     * Get Employee ID
     * 
     * @return long
     */
    public long getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return String.format("Employee [ID:%d]: %s %s, %d y.o.", employeeID, firstName, secondName, age);
    }
}
