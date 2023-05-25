public class SRP {
    // 1) Переписать код в соответствии с Single Responsibility Principle:
    // Подсказка: вынесите метод calculateNetSalary() в отдельный класс
    public static void main(String[] args) {
        Employee person1 = new Employee("Thomas", 70000);
        Accouting headOffice = new Accouting();
        System.out.println(person1.getEmpInfo());
        System.out.println("After tax salary: " + headOffice.calculateAfterTaxSalary(person1));
    }    
}
