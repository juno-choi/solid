import pocketmon.Battle;
import pocketmon.PocketMon;
import pocketmon.battle_type.ElectricBattle;
import pocketmon.battle_type.FireBattle;
import pocketmon.battle_type.LegendBattle;
import pocketmon.console.MemberShipConsolePrint;
import pocketmon.console.NormalConsolePrint;

public class Main {
    public static void main(String[] args) {
        ElectricBattle electricBattle = new ElectricBattle(new MemberShipConsolePrint());
        FireBattle fireBattle = new FireBattle(new MemberShipConsolePrint());
        LegendBattle legendBattle = new LegendBattle(new MemberShipConsolePrint());

        PocketMon 피카츄 = new PocketMon("피카츄", "electric", 10, 100);
        int 피카츄_공격 = electricBattle.attack(피카츄);

        PocketMon 파이리 = new PocketMon("파이리", "fire", 10, 100);
        int 파이리_공격 = fireBattle.attack(파이리);

        PocketMon 뮤츠 = new PocketMon("뮤츠", "legend", 20, 120);
        int 뮤츠_공격 = legendBattle.attack(뮤츠);
    }
}