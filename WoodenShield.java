public class WoodenShield implements Shield{


    @Override 
    public int protection(){
        return 5;
    }


    @Override
    public String toString() {
        return String.format("Деревянный щит, защита %d", this.protection());
    }
}