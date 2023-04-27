package service.Classes;

import java.util.List;

import domain.Classes.Person.Person;

public class AverageAge<T extends Person> {
    /**
     * There's an universal method to get average age between people in a group
     * 
     * @param <T>  must be instance of Person
     * @param list contains list of members in a group
     */
    public static <T extends Person> void getAverageAge(List<T> list) {
        int sum = 0;
        for (T person : list) {
            sum += person.getAge();
        }
        sum /= list.size();
        System.out.printf("Average Age: %d\n", sum);
    }
}
