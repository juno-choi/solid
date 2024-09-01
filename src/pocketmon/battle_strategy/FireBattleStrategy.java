package pocketmon.battle_strategy;

import pocketmon.PocketMon;

public class FireBattleStrategy implements BattleStrategy{

    @Override
    public int attack(PocketMon pocketMon) {
        int damage = (int) ((pocketMon.getPower() - 11) * 1.2);
        return damage < 0 ? 1 : damage;
    }

}
