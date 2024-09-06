package pocketmon.battle_type;

import pocketmon.Battle;
import pocketmon.PocketMon;
import pocketmon.battle_strategy.BattleStrategy;
import pocketmon.battle_strategy.ElectronicBattleStrategy;
import pocketmon.console.ConsolePrint;

public class ElectricBattle extends Battle {


    public ElectricBattle(ConsolePrint consolePrint) {
        super(consolePrint);
    }

    @Override
    protected int getDamage(PocketMon pocketMon) {
        BattleStrategy battleStrategy= new ElectronicBattleStrategy();
        System.out.println("ElectricBattle 사용");
        return battleStrategy.attack(pocketMon);
    }
}
