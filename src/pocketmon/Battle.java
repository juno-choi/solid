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

    private int getDamage(PocketMon pocketMon) {
        BattleStrategy battleStrategy = null;
        if ("fire".equals(pocketMon.getType())) {
            battleStrategy = new FireBattleStrategy();
        } else if ("electric".equals(pocketMon.getType())) {
            battleStrategy = new ElectronicBattleStrategy();
        } else if ("legend".equals(pocketMon.getType())) {
            LegendBattleStrategy legendBattleStrategy = new LegendBattleStrategy();
            legendBattleStrategy.legendAppear();
            battleStrategy = legendBattleStrategy;
        }

        if (battleStrategy == null) {
            throw new IllegalArgumentException("Unknown type: " + pocketMon.getType());
        }

        return battleStrategy.attack(pocketMon);
    }
}
