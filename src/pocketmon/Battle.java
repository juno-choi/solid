package pocketmon;

import pocketmon.battle_strategy.BattleStrategy;
import pocketmon.battle_strategy.ElectronicBattleStrategy;
import pocketmon.battle_strategy.FireBattleStrategy;
import pocketmon.battle_strategy.LegendBattleStrategy;
import pocketmon.battle_type2.Battle2;
import pocketmon.console.ConsolePrint;

public class Battle {
    private ConsolePrint consolePrint;
    private PocketMon pocketMon;
    private Battle2 battleType;

    public Battle(ConsolePrint consolePrint, PocketMon pocketMon, Battle2 battleType) {
        this.consolePrint = consolePrint;
        this.pocketMon = pocketMon;
        this.battleType = battleType;
    }

    public int attack() {
        int damage = 0;

        damage = battleType.getDamage(pocketMon);

        consolePrint.attackPrint(pocketMon.getName(), damage);
        return damage;
    }
}
