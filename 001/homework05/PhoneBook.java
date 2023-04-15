// 1) Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

// Пусть дан список сотрудников:
// [...]

// 2) Написать программу, которая найдёт и выведет повторяющиеся 
// имена с количеством повторений. Отсортировать по убыванию популярности.
// 3) Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {
        // Key = number & Value = user: (name surename)
        Map<String, String> phoneBook = new HashMap<>();

        // Create db uses staff list
        String[] staff = new String[] { "Иван Иванов","Светлана Петрова","Кристина Белова","Анна Мусина","Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"};

        // Prefix to be sure that each phone number is unique 
        int prefix = 100; // but (less 1000)
        
        // Fill map
        for (String worker : staff) {
            // java.util.Random
            Random random = new Random();
            int randomWithNextInt = random.nextInt(1, 6); // [1, 5]
            for (int i = 0; i < randomWithNextInt; i++) {
                phoneBook.put(String.format("8(90%d) %d-%d%d-00", randomWithNextInt, prefix, i, i + 1), worker);
                prefix += randomWithNextInt;
            }
        }

        // 2. Create New HashMap where is key:name value:count
        Map<String, Integer> query = new HashMap<>();

        for (var item : phoneBook.entrySet()) {
            String name = item.getValue().substring(0, item.getValue().indexOf(" "));
            if (query.containsKey(name)) {
                query.put(name, query.get(name) + 1);
            } else {
                query.put(name, 1);
            }
        } 

        // 3. Release Heap Sort
        Collection<Integer> results = query.values();
        int[] array = results.stream().mapToInt(i -> i).toArray();
        heapSort(array);

        for (int position : array) {
            for (var item : query.entrySet()) {
                if (Objects.equals(position, item.getValue())) {
                    System.out.printf("%s (%d)\n", item.getKey(), item.getValue());
                    query.put(item.getKey(), -1); // to avoid next
                }
            }
        }
    }

    public static void heapSort(int[] array) {
        // Create Tree
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, i, n);
        }

        // Sorting..
        for (int j = n - 1; j >= 0; j--) {
            int tmp = array[j];
            array[j] = array[0];
            array[0] = tmp;
            heapify(array, 0, j);
        }
    }

    public static void heapify(int[] array, int i, int n) {
        int leftChild = i * 2 + 1;
        int rigthChild = i * 2 + 2;
        int largest = i;

        if (leftChild < n && array[leftChild] < array[largest]) {
            largest = leftChild;
        }

        if (rigthChild < n && array[rigthChild] < array[largest]) {
            largest = rigthChild;
        }
        
        if (i != largest) {
            int tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;

            heapify(array, largest, n);
        }
    }
}