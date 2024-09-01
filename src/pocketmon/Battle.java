package pocketmon;

public class Battle {
    public int attack(PocketMon pocketMon) {
        int damage = 0;

        damage = getDamage(pocketMon);

        System.out.println("%s(이/가) %d의 데미지를 주었습니다.".formatted(pocketMon.getName(), damage));
        return damage;
    }

    private static int getDamage(PocketMon pocketMon) {
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
