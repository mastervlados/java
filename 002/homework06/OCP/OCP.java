public class OCP {
    // 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
    // Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP
    public static void main(String[] args) {
        Car ferrari = new Car(300, "major");
        Bus yellowBus = new Bus(140, "school");
        System.out.println(ferrari.calculateAllowedSpeed());
        System.out.println(yellowBus.calculateAllowedSpeed());
    }
}
