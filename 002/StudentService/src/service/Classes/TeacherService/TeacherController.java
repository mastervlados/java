package service.Classes.TeacherService;

import domain.Classes.Person.People.Teacher;
import service.Interfaces.iPersonController;

public class TeacherController implements iPersonController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    
    @Override
    public void create(String firstName, String SecondName, int age) {
        teacherService.create(firstName, SecondName, age);
    }
    
}
