package service.Classes.EmployeeService;

import domain.Classes.Person.People.Employee;
import service.Interfaces.iPersonController;

public class EmployeeController implements iPersonController<Employee> {

    private final EmployeeService empService = new EmployeeService();

    @Override
    public void create(String firstName, String SecondName, int age) {
        empService.create(firstName, SecondName, age);
    }

    public static <T extends Employee> void paySalary(T person) {
        System.out.println(person.getFirstName() + " зп 10000p");
    }

    public static <T extends Number> Double mean(T[] numbers) {
        double sum = 0.0;
        int numbersLength = numbers.length;
        for (int i = 0; i < numbersLength; i++) {
            sum += numbers[i].doubleValue();
        }
        sum /= numbersLength;
        return sum;
    }
}
