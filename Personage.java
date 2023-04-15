import java.util.Random;

public abstract class Personage {
    protected static Random rnd = new Random();
    private String name;
    private int hp;

    public boolean isAlive(){
        return hp>0;
    }

    public Personage(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}