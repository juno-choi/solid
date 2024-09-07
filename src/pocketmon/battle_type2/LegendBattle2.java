package pocketmon.battle_type2;

import pocketmon.PocketMon;
import pocketmon.battle_strategy.BattleStrategy;
import pocketmon.battle_strategy.LegendBattleStrategy;

public class LegendBattle2 implements Battle2{
    @Override
    public int getDamage(PocketMon pocketMon) {
        BattleStrategy battleStrategy= new LegendBattleStrategy();
        System.out.println("LegendBattle2 사용");
        return battleStrategy.attack(pocketMon);
    }
}
