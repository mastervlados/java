package Rewards.Candy;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class CandyGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new CandyRewards();
    }
}

