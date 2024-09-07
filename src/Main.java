import pocketmon.Battle;
import pocketmon.PocketMon;
import pocketmon.battle_type2.ElectricBattle2;
import pocketmon.battle_type2.FireBattle2;
import pocketmon.battle_type2.LegendBattle2;
import pocketmon.console.ConsolePrint;
import pocketmon.console.MemberShipConsolePrint;

public class Main {
    public static void main(String[] args) {
        final ConsolePrint consolePrint = new MemberShipConsolePrint();

        PocketMon 피카츄 = new PocketMon("피카츄", "electric", 10, 100);
        int 피카츄_공격 = new Battle(consolePrint, 피카츄, new ElectricBattle2()).attack();

        PocketMon 파이리 = new PocketMon("파이리", "fire", 10, 100);
        int 파이리_공격 = new Battle(consolePrint, 파이리, new FireBattle2()).attack();

        PocketMon 뮤츠 = new PocketMon("뮤츠", "legend", 20, 120);
        int 뮤츠_공격 = new Battle(consolePrint, 뮤츠, new LegendBattle2()).attack();
    }
}