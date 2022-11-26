package DecoratorFirst;

public class Demo {

    public static void main(String[] args) {
        IHouse kitchenH = new Kitchen(new BasicHouse());
        kitchenH.renovate();
        System.out.println("\n**********************************************************************");

        IHouse kitchenRestroomH = new Kitchen(new Restroom(new BasicHouse()));
        kitchenRestroomH.renovate();
    }

}