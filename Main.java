public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, new Bow(20)))
                .addPers(new Archer("Гуд", 100, new Bow(15)));
        thiefTeam.addPers(new Thief("Джек", 150, new Knife(), new WoodenShield()))
                .addPers(new Thief("Потрошитель", 150, new Knife(), new SteelShield()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        System.out.println();
        

        Thief war1 = new Thief("Давид", 50, new Knife(),new WoodenShield());
        Archer war2 = new Archer("Робин", 50, new Bow(50));
        Battle fight = new Battle(war1,war2);
        fight.run();
    }
}