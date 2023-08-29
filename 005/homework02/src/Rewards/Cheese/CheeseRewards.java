package Rewards.Cheese;

import Abstractions.IGameItem;

public class CheeseRewards implements IGameItem {

    @Override
    public String open() {
        return "🧀 Cheese";
    }
}
