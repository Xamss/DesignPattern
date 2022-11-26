package DecoratorSecond;

public class Demo {

    public static void main(String[] args) {
        Attack attack = new Duration(new BasicAttack());
        attack.getStats();
        System.out.println("\n**********************************************************************");

        Attack attack2 = new Duration(new Area(new BasicAttack()));
        attack2.getStats();
    }

}
