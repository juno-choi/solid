package pocketmon.console;

public class MemberShipConsolePrint implements ConsolePrint{
    @Override
    public void attackPrint(String pocketMonName, int damage) {
        System.out.println("🔴 %s(이/가) %d의 데미지를 주었습니다. 🔴".formatted(pocketMonName, damage));
    }
}
