package Interface;

public class main {

    public static void main(String[] args) {
        Ironman h1 = new Ironman();
        h1.setName("Ironman");
        h1.setAge("40");
        h1.displsyHero();
        h1.skill("Shooting");
        System.out.println("=================");
        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge("320");
        h2.displsyHero();
        h2.skill("Flying");
        h2.weapon("Mjolnir");
        System.out.println("=================");
    }
}
