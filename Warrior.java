import java.util.Random;

public abstract class Warrior<W extends Weapon> extends Personage{
protected static Random rnd = new Random();
    protected W weapon;
    public Warrior(String name, int hp, W weapon) {
        super(name, hp);
        this.weapon = weapon;
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }
    public void RecieveDamage(int damage){
        this.setHp(this.getHp()-damage);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon));
        return res.toString();
    }
}