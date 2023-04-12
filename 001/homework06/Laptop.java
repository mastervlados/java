import java.util.*;

public class Laptop {

    // Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
    
    // Создать множество ноутбуков.

    // Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

    // “Введите цифру, соответствующую необходимому критерию:

    // 1 - ОЗУ
    // 2 - Объём ЖД
    // 3 - Операционная система
    // 4 - Цвет
    // 5 - Объем SSD
    // 6 - Диагональ экрана

    // Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
    // Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

    private int ram;
    private int hddSize;
    private int ssdSize;
    private String operationSystem;
    private String color;
    private float screenSize;

    public static void main(String[] args) {

        Set<Map<Integer, Object>> store = new HashSet<>();

        Laptop item1 = new Laptop(8, 500, 64, "Windows", "DarkBlue", 21.5f);
        putLaptopToTheStore(store, item1);

        Laptop item2 = new Laptop(16, 500, 500, "Windows", "White", 23.6f);
        putLaptopToTheStore(store, item2);

        Laptop item3 = new Laptop(8, 500, 0, "Linux", "SandBlue", 18.5f);
        putLaptopToTheStore(store, item3);

        Laptop item4 = new Laptop(12, 250, 250, "Windows", "LightGray", 21.5f);
        putLaptopToTheStore(store, item4);

        Laptop item5 = new Laptop(32, 1000, 1000, "MacOS", "Black", 22.0f);
        putLaptopToTheStore(store, item5);

        Laptop item6 = new Laptop(16, 700, 300, "MacOS", "White", 15.4f);
        putLaptopToTheStore(store, item6);

        // System.out.println(store);

        System.out.println("**************************************");
        System.out.println("**** Welcome to the laptop store! ****");
        System.out.println("**************************************");
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ\n2 - Объем HDD\n3 - Операционная система\n4 - Цвет\n5 - Объем SSD\n6 - Диагональ экрана\n0 - Выйти");
        
        Map<Integer, Object> criteria = new HashMap<>();
        boolean doesUserContinueEnterData = true;

        while (doesUserContinueEnterData) {
            int userNumber = getNumberSuggestInput("the number of criteria");
            switch (userNumber) {
                case 1:
                    int suggestRam = getNumberSuggestInput("the min size of ram");
                    criteria.put(userNumber, suggestRam);
                    break;
                case 2:
                    int suggestHdd = getNumberSuggestInput("the min size of HDD");
                    criteria.put(userNumber, suggestHdd);
                    break;
                case 3:
                    String suggestOS = getLineSuggestInput("name of OS, like (Windows, Linux, MacOS)");
                    criteria.put(userNumber, suggestOS);
                    break;
                case 4:
                    String suggestColor = getLineSuggestInput("wanted color");
                    criteria.put(userNumber, suggestColor);
                    break;
                case 5:
                    int suggestSsd = getNumberSuggestInput("the min size of SSD");
                    criteria.put(userNumber, suggestSsd);
                    break;
                case 6:
                    float suggestScreenSize = getFloatSuggestInput("necessary screen size, (like 20.0)");
                    criteria.put(userNumber, suggestScreenSize);
                    break;
                default:
                    doesUserContinueEnterData = false;
                    break;
            }
        }

        // System.out.println(criteria);

        filterLotsByCriteria(store, criteria);
    }

    public Laptop(int ram, int hddSize, int ssdSize, String operationSystem, String color, float screenSize) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.ssdSize = ssdSize;
        this.operationSystem = operationSystem;
        this.color = color;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHDDSize() {
        return this.hddSize;
    }

    public int getSSDSize() {
        return this.ssdSize;
    }

    public String getOperationSystem() {
        return this.operationSystem;
    }

    public String getColor() {
        return this.color;
    }

    public float getScreenSize() {
        return this.screenSize;
    }

    public static void putLaptopToTheStore(Set<Map<Integer, Object>> store, Laptop lot) {
        Map<Integer, Object> item = new HashMap<>();
        // 1 - ОЗУ
        // 2 - Объём HDD
        // 3 - Операционная система
        // 4 - Цвет
        // 5 - Объём SSD
        // 6 - Диагональ экрана
        item.put(1, lot.getRam());
        item.put(2, lot.getHDDSize());
        item.put(3, lot.getOperationSystem());
        item.put(4, lot.getColor());
        item.put(5, lot.getSSDSize());
        item.put(6, lot.getScreenSize());

        store.add(item);
    }

    public static int getNumberSuggestInput(String label) {
        Scanner iScanner = new Scanner(System.in);
        int number = -1;
        
        System.out.printf("Enter %s: ", label);
        
        while (!iScanner.hasNextInt()) {
            iScanner.next();
            System.out.print("Only numbers allowed. Try again: ");
        }

        number = iScanner.nextInt();

        // System.out.printf("%s = %d\n", label, number);
        return number;
    }

    public static float getFloatSuggestInput(String label) {
        Scanner iScanner = new Scanner(System.in);
        float number = -0.1f;
        
        System.out.printf("Enter %s: ", label);
        
        while (!iScanner.hasNextFloat()) {
            iScanner.next();
            System.out.print("Only numbers allowed. Try again: ");
        }

        number = iScanner.nextFloat();

        return number;
    }

    public static String getLineSuggestInput(String label) {
        Scanner iScanner = new Scanner(System.in);
        String data = new String();
        
        System.out.printf("Enter %s: ", label);
        
        data = iScanner.nextLine();

        return data;
    }

    public static Set<Map<Integer, Object>> filterLotsByCriteria(Set<Map<Integer, Object>> store, Map<Integer, Object> criteria) {
        System.out.println("\nFind lost by next criteria:");
        
        for (var value : criteria.entrySet()) {
            System.out.printf("%d - %s\n", value.getKey(), value.getValue());   
        }

        System.out.println("\nSearch result:");

        Set<Map<Integer, Object>> filter = new HashSet<>();

        for (Map<Integer, Object> lot : store) {
            for (var attribute : lot.entrySet()) {
                int key = attribute.getKey();
                if (!criteria.containsKey(key)) {
                    continue;
                }

                Object val = attribute.getValue();
                if (val instanceof Integer) {
                    int param1 = (int)val;
                    int param2 = (int)criteria.get(key);
                    if (param1 == param2) {
                        filter.add(lot);
                    }
                } else if (val instanceof Float) {
                    float param1 = (float)val;
                    float param2 = (float)criteria.get(key);
                    if (param1 == param2) {
                        filter.add(lot);
                    }
                } else {
                    String param1 = val.toString().toLowerCase();
                    String param2 = criteria.get(key).toString().toLowerCase();
                    // System.out.println(param1);
                    // System.out.println(param2);
                    if (param1.equals(param2)) {
                        filter.add(lot);
                    }
                } 
            }
        }

        System.out.println(filter);
        return filter;
    }
}