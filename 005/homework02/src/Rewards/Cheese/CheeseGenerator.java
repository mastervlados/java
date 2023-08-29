package Rewards.Cheese;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class CheeseGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new CheeseRewards();
    }
}
