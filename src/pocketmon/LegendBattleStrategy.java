package pocketmon;

public class LegendBattleStrategy implements BattleStrategy, BattleStrategyForLegend {
    @Override
    public int attack(PocketMon pocketMon) {
        return pocketMon.getPower();
    }

    @Override
    public void legendAppear() {
        System.out.println("!!!!!레전드 포켓몬 등장!!!!!");
    }
}
