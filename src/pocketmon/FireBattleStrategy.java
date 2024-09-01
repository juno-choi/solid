package pocketmon;

public class FireBattleStrategy implements BattleStrategy{

    @Override
    public int attack(PocketMon pocketMon) {
        return (int) (pocketMon.getPower() * 1.2);
    }
}
