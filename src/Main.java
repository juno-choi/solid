import pocketmon.Battle;
import pocketmon.PocketMon;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        PocketMon 피카츄 = new PocketMon("피카츄", "electric", 10, 100);
        int 피카츄_공격 = battle.attack(피카츄);

        PocketMon 파이리 = new PocketMon("파이리", "fire", 10, 100);
        int 파이리_공격 = battle.attack(파이리);
    }
}