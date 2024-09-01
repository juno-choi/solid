package pocketmon;

public class Battle {
    public int attack(PocketMon pocketMon) {
        int damage = 0;

        damage = getDamage(pocketMon);

        System.out.println("%s(이/가) %d의 데미지를 주었습니다.".formatted(pocketMon.getName(), damage));
        return damage;
    }

    private static int getDamage(PocketMon pocketMon) {
        if ("fire".equals(pocketMon.getType())) {
            return (int) (pocketMon.getPower() * 1.2);
        }
        return pocketMon.getPower();
    }
}
