public class Car implements iEngine {
    private iEngine engine;

    public Car(iEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        this.engine.start();
    }
}
