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
        }

        if (battleStrategy == null) {
            throw new IllegalArgumentException("Unknown type: " + pocketMon.getType());
        }

        if (battleStrategy instanceof FireBattleStrategy) {
            if (pocketMon.getPower() < 11) {
                return 1;
            }

        }

        return battleStrategy.attack(pocketMon);
    }
}
