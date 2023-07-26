package homework04;

public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Андрей");
        res = hashMap.put("+79005554432", "Алексей");
        res = hashMap.put("+79005554432", "Дарья1");
        res = hashMap.put("+79005554433", "Дарья2");
        res = hashMap.put("+79005554434", "Дарья3");
        res = hashMap.put("+79005554435", "Дарья4");
        res = hashMap.put("+79005554436", "Дарья5");
        res = hashMap.put("+79005554437", "Дарья6");
        res = hashMap.put("+79005554438", "Дарья7");
        res = hashMap.put("+79005554439", "Дарья8");
        res = hashMap.put("+79062276944", "Владислав");
        res = hashMap.put("+79062276945", "Михаил");
        
        // Expected: 10 - 1 (removed) = 9
        hashMap.remove("+79005554438");

        int k = 0;

        for (HashMap.Entity element : hashMap) {
            System.out.println(++k + ") " + element.key + " - " + element.value);
        }
        // Result: O(n^2)
        // 1) +79005554432 - Дарья1
        // 2) +79062276944 - Владислав
        // 3) +79005554433 - Дарья2
        // 4) +79062276945 - Михаил
        // 5) +79005554434 - Дарья3
        // 6) +79005554435 - Дарья4
        // 7) +79005554436 - Дарья5
        // 8) +79005554437 - Дарья6
        // 9) +79005554439 - Дарья8
    }

}


