package Abstractions;

// Абстракция класса фабрики
public abstract class ItemGenerator {
    // шанс выпадения при одной попытке: 0-100%
    protected int percentYeld;

    public int getPercentYeld() {
        return this.percentYeld;
    }

    public void setPercentYeld(int yeld) {
        if (yeld > 100) {
            this.percentYeld = 100;
        } else if (yeld < 0) {
            this.percentYeld = 0;
        } else {
            this.percentYeld = yeld;
        }
    }

    // Метод взаимодействия с абстрактной продукцией
    // return: содержимое из разных сундуков

    public String openReward() {
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    // метод создания экземпляра продукта
    // return: экземпляр продукта
    public abstract IGameItem createItem();
}
