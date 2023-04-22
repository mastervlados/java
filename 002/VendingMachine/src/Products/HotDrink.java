package Products;

public class HotDrink extends Product {
    
    /** Температура напитка */
    private int temperature;

    public HotDrink(String name, double price, int temperature)
    {
        super(name, price);
        this.temperature = temperature;
    }

    /** Получить температуру напитка */
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", temperature=" + temperature +
        "C}";
    }
}
