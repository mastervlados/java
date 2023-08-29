package Rewards.Beef;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class BeefGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new BeefRewards();
    }
}

