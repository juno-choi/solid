package pocketmon.battle_type2;

import pocketmon.PocketMon;

public class FireBattle2 implements Battle2 {
    @Override
    public int getDamage(PocketMon pocketMon) {
        System.out.println("FireBattle2 사용");
        return (int) ((pocketMon.getPower() - 11) * 1.2);
    }
}
