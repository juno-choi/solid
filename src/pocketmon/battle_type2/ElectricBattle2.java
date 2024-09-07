package pocketmon.battle_type2;

import pocketmon.PocketMon;
import pocketmon.battle_strategy.BattleStrategy;
import pocketmon.battle_strategy.ElectronicBattleStrategy;

public class ElectricBattle2 implements Battle2 {
    @Override
    public int getDamage(PocketMon pocketMon) {
        BattleStrategy battleStrategy= new ElectronicBattleStrategy();
        System.out.println("ElectricBattle2 사용");
        return battleStrategy.attack(pocketMon);
    }
}
