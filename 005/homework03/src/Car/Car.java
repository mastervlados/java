package Car;

import Interfaces.IEngine;

public abstract class Car implements IEngine {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int totalNumberOfWheels;
    private String fuelType;
    private String gearBoxType;
    private int engineCapacity;
    private IEngine engineType;

    public Car(String brand, String model, String color, String bodyType, int totalNumberOfWheels, String fuelType,
            String gearBoxType, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.totalNumberOfWheels = totalNumberOfWheels;
        this.fuelType = fuelType;
        this.gearBoxType = gearBoxType;
        this.engineCapacity = engineCapacity;
    }

    public Car() {
        this("", "", "", "", 0, "", "", 0);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getTotalNumberOfWheels() {
        return totalNumberOfWheels;
    }

    public void setTotalNumberOfWheels(int totalNumberOfWheels) {
        this.totalNumberOfWheels = totalNumberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(String gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void fueling() {
        this.engineType.fueling();
    }

    public IEngine getEngineType() {
        return engineType;
    }

    public void setEngineType(IEngine engineType) {
        this.engineType = engineType;
    }
    
}
