package service.Classes.StudentService;

import domain.Classes.Person.People.Student;
import service.Classes.StudentGroupService;
import service.Interfaces.iPersonController;

public class StudentController implements iPersonController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    @Override
    public void create(String firstName, String SecondName, int age) {
        dataService.create(firstName, SecondName, age);    
    }
}
