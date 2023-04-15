import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T>{
    List<T> personages = new ArrayList<>();
    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> addPers (T personage){
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T personage:this) {
            res.append(personage)
                    .append("\n");
        }
        res.append(String.format("Максимальная дальность: %d\n", maxRange()));
        res.append(String.format("Миниальная защита: %d\n",minProtection()));
        return res.toString();
    }

    public int maxRange (){
        int max = 0;
        for (T pers:this) {
            if (pers instanceof Archer){
                Archer archer = (Archer) pers;
                if(archer.range()>max){
                    max= archer.range();
                }
            }
        }
        return max;
    }

    public int minProtection(){
        if (this.hasWarriorsWithShield()){
            int min=1000;
            for (T pers:this) {
                if(pers instanceof WarriorWithShield){
                    WarriorWithShield wws = (WarriorWithShield) pers;
                    if(wws.shield.protection()<min){
                        min= wws.shield.protection();
                    }}
                }
            return min;
        }
        else return 0;
    }
    private boolean hasWarriorsWithShield(){
        for (T pers:this) {
            if (pers instanceof WarriorWithShield){
                return true;
            }
        }
        return false;
    } 
}