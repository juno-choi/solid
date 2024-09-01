package pocketmon.battle_strategy;

import pocketmon.PocketMon;

public class ElectronicBattleStrategy implements BattleStrategy{
    @Override
    public int attack(PocketMon pocketMon) {
        return pocketMon.getPower();
    }

}
