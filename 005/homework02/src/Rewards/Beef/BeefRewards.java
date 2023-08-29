package Rewards.Beef;

import Abstractions.IGameItem;

public class BeefRewards implements IGameItem {

    @Override
    public String open() {
        return "🥩 Beef";
    }
}
