public class SteelShield implements Shield{
    @Override 
    public int protection(){
        return 10;
    }


    @Override
    public String toString() {
        return String.format("Стальной щит, защита %d", this.protection());
    }
}
