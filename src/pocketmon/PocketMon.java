package pocketmon;

public class PocketMon {
    private String name;
    private String type;
    private int power;
    private int hp;

    public PocketMon(String name, String type, int power, int hp) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }
}