public class DIP {
    // 5) Переписать код в соответствии с Dependency Inversion Principle:
    public static void main(String[] args) {
        iEngine petrol = new PetrolEngine();
        iEngine disel = new DieselEngine();
        Car firstCar = new Car(petrol);
        Car secondCar = new Car(disel);
        firstCar.start();
        secondCar.start();
    }
}
