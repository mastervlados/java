package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Abstractions.ItemGenerator;
import Rewards.Beef.BeefGenerator;
import Rewards.Candy.CandyGenerator;
import Rewards.Cheese.CheeseGenerator;
import Rewards.Diamond.DiamondGenerator;

public class Core {

    // Логика игры
    public void run() {
        System.out.println(" _-+-*-+-_ ");
        System.out.println("+---------+");
        System.out.println("|--['8']--|");
        System.out.println("+---------+");
        System.out.println(" ~ Big adventurer chest!");
        System.out.println(" ~ Your rewards:");

        List<ItemGenerator> generatorList = new ArrayList<>();

        ItemGenerator diamond = new DiamondGenerator();
        diamond.setPercentYeld(4);
        generatorList.add(diamond);

        ItemGenerator cheese = new CheeseGenerator();
        cheese.setPercentYeld(70);
        generatorList.add(cheese);

        ItemGenerator beef = new BeefGenerator();
        beef.setPercentYeld(30);
        generatorList.add(beef);

        ItemGenerator candy = new CandyGenerator();
        candy.setPercentYeld(144);
        generatorList.add(candy);

        for (ItemGenerator item : generatorList) {
            int attemptCount = this.getRandomIntInRange(1, 10);
            int itemCount = 0;
            int yeld = item.getPercentYeld();
            for (int j = 0; j < attemptCount; j++) {
                if (this.getRandomIntInRange(0, 100) <= yeld)
                    itemCount++;
            }
            if (itemCount > 0) {
                System.out.printf("    x%d %s\n", itemCount, item.openReward());
            }
        }
    }

    private int getRandomIntInRange(int min, int max) {
        Random rand = new Random();
        int randomInteger = rand.nextInt((max - min) + 1) + min;
        return randomInteger;
    }
}