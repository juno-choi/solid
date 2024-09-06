package pocketmon;

import pocketmon.battle_strategy.BattleStrategy;
import pocketmon.battle_strategy.ElectronicBattleStrategy;
import pocketmon.battle_strategy.FireBattleStrategy;
import pocketmon.battle_strategy.LegendBattleStrategy;
import pocketmon.console.ConsolePrint;

public class Battle {
    private ConsolePrint consolePrint;

    public Battle(ConsolePrint consolePrint) {
        this.consolePrint = consolePrint;
    }

    public int attack(PocketMon pocketMon) {
        int damage = 0;

        damage = getDamage(pocketMon);

        consolePrint.attackPrint(pocketMon.getName(), damage);
        return damage;
    }

    protected int getDamage(PocketMon pocketMon) {
        BattleStrategy battleStrategy = new ElectronicBattleStrategy();
        return battleStrategy.attack(pocketMon);
    }
}
