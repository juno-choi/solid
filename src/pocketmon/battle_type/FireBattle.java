package pocketmon.battle_type;

import pocketmon.Battle;
import pocketmon.PocketMon;
import pocketmon.battle_strategy.BattleStrategy;
import pocketmon.battle_strategy.FireBattleStrategy;
import pocketmon.console.ConsolePrint;

public class FireBattle extends Battle {
    public FireBattle(ConsolePrint consolePrint) {
        super(consolePrint);
    }


    @Override
    protected int getDamage(PocketMon pocketMon) {
        BattleStrategy battleStrategy= new FireBattleStrategy();
        System.out.println("FireBattle 사용");
        return battleStrategy.attack(pocketMon);
    }
}
