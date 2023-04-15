import java.util.Random;

public class WarriorWithShield<W extends Weapon, S extends Shield> extends Warrior{
    public S shield;
    private Random rnd = new Random();

    public WarriorWithShield(String name, int hp, W weapon,S shield) {
        super(name, hp, weapon);
        this.shield = shield;
    }
    @Override
    public void RecieveDamage(int damage) {
        boolean ifHelped = rnd.nextBoolean();
        if(ifHelped){
            super.RecieveDamage(damage-this.shield.protection());
            System.out.printf("Щит помог войну %s\n", this.getName());}
        else super.RecieveDamage(damage);
    }
    @Override
    public String toString() {
        return super.toString()+String.format("С защитой %s", this.shield);

        }

    
    
}
