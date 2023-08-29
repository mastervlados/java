package Rewards.Candy;

import Abstractions.IGameItem;

public class CandyRewards implements IGameItem {

    @Override
    public String open() {
        return "🍬 Candy";
    }
}
