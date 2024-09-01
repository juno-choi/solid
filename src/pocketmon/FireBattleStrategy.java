package pocketmon;

public class FireBattleStrategy implements BattleStrategy{

    @Override
    public int attack(PocketMon pocketMon) {
        return (int) ((pocketMon.getPower() - 11) * 1.2);
    }
}
