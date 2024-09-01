package pocketmon;

public class ElectronicBattleStrategy implements BattleStrategy{
    @Override
    public int attack(PocketMon pocketMon) {
        return pocketMon.getPower();
    }

    @Override
    public void legendAppear() {
        return ;
    }
}
