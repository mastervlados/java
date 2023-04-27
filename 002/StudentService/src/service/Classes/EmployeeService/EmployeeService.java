package service.Classes.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import domain.Classes.Person.PersonComparator;
import domain.Classes.Person.People.Employee;
import service.Interfaces.iPersonService;

public class EmployeeService implements iPersonService<Employee> {

    private int count;
    private List<Employee> workers;

    public EmployeeService() {
        this.workers = new ArrayList<Employee>();
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Employee registerNewEmployee = new Employee(firstName, secondName, age, this.count);
        count++;
        workers.add(registerNewEmployee);
    }

    @Override
    public List<Employee> getAll() {
        return workers;
    }

    public List<Employee> getSortedByFIOEmployee(int groupNumber) {
        List<Employee> newWorkersList = new ArrayList<>(workers);
        newWorkersList.sort(new PersonComparator<Employee>());
        return newWorkersList;
    }
}
