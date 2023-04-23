import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Classes.Person;
import Classes.StudentFlow;
import Classes.StudentGroup;
import Classes.People.Student;
import Classes.People.Teacher;


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
        Collections.sort(juniorDevelopers.getGroups());
        for (StudentGroup group : juniorDevelopers) {
            System.out.println(group);
        }

        System.out.println("**** Sorting by group's indexes ****");
        Collections.sort(juniorDevelopers.getGroups(), new Comparator<StudentGroup>() {
            @Override
            public int compare(StudentGroup o1, StudentGroup o2) {
                if (o1.getGroupID() == o2.getGroupID()) {
                    return 0;
                } else if (o1.getGroupID() > o2.getGroupID()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        
        for (StudentGroup group : juniorDevelopers) {
            System.out.println(group);
        }
    }
}
