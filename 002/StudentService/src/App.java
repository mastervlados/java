import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.Classes.Person.Person;
import domain.Classes.Person.People.Employee;
import domain.Classes.Person.People.Student;
import domain.Classes.Person.People.Teacher;
import domain.Classes.StudentFlow.StudentFlow;
import domain.Classes.StudentGroup.StudentGroup;
import domain.Classes.StudentGroup.StudentGroupComparator;
import service.Classes.AverageAge;


public class App {
    public static void main(String[] args) throws Exception {
        Person u1 = new Person("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 24, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 23, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        Student s7 = new Student("Мирон", "Федоров", 25, (long)107);
        Student s8 = new Student("Илья", "Газманов", 29, (long)108);
        Student s9 = new Student("Настя", "Дроздова", 28, (long)109);
        Teacher t1 = new Teacher("Владислав", "Елизаров", 27, (long)3366, "Умение учиться");
        Teacher t2 = new Teacher("Роман", "Стельмах", 33, (long)3367, "Компьютерные сети");
        Teacher t3 = new Teacher("Николай", "Дроздов", 45, (long)3368, "Математика");
        Employee e1 = new Employee("Денис", "Гусев", 34, 200);

        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);

        List<Student> groupA = new ArrayList<Student>();
        groupA.add(s1);
        groupA.add(s2);

        StudentGroup alpha = new StudentGroup(groupA, "Alpha", 101);
        alpha.addStudentToGroup(s3);

        List<Student> groupB = new ArrayList<Student>();
        groupB.add(s4);
        groupB.add(s5);

        StudentGroup bravo = new StudentGroup(groupB, "Bravo", 102);
        bravo.addStudentToGroup(s6);
        bravo.addStudentToGroup(s7);

        System.out.println("**** After Sorting.. ****");
        Collections.sort(alpha.getStudents());
        System.out.println(alpha); 
        System.out.println("**** After Sorting.. ****");
        Collections.sort(bravo.getStudents());
        System.out.println(bravo);

        StudentFlow juniorDevelopers = new StudentFlow("Junior Developers", 1001);

        List<Student> groupC = new ArrayList<Student>();
        groupC.add(s8);
        groupC.add(s9);
        StudentGroup zZ = new StudentGroup(groupC, "zZzZzZz", 104);

        juniorDevelopers.addGroupToFlow(alpha);
        juniorDevelopers.addGroupToFlow(zZ);
        juniorDevelopers.addGroupToFlow(bravo);

        System.out.println(juniorDevelopers);
        for (StudentGroup group : juniorDevelopers) {
            System.out.println(group);
        }

        System.out.println("**** Sorting by count students in group ****");
        Collections.sort(juniorDevelopers.getGroups(), StudentGroupComparator.getComparatorByCountMembersInGroup());
        for (StudentGroup group : juniorDevelopers) {
            System.out.println(group);
        }

        System.out.println("**** Sorting by group's indexes ****");
        Collections.sort(juniorDevelopers.getGroups(), StudentGroupComparator.getComparatorByGroupIndex());
        
        for (StudentGroup group : juniorDevelopers) {
            System.out.println(group);
        }

        System.out.println("**** Average Age in Alpha group ****");
        AverageAge.getAverageAge(alpha.getStudents());
        System.out.println("**** Average Age in Teachers group ****");
        AverageAge.getAverageAge(teachers);
    }
}
