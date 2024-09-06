package pocketmon.battle_type;

import pocketmon.Battle;
import pocketmon.PocketMon;
import pocketmon.battle_strategy.BattleStrategy;
import pocketmon.battle_strategy.LegendBattleStrategy;
import pocketmon.console.ConsolePrint;

public class LegendBattle extends Battle {
    public LegendBattle(ConsolePrint consolePrint) {
        super(consolePrint);
    }

    @Override
    protected int getDamage(PocketMon pocketMon) {
        BattleStrategy battleStrategy= new LegendBattleStrategy();
        System.out.println("LegendBattle 사용");
        return battleStrategy.attack(pocketMon);
    }
}
