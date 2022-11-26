package DecoratorFirst;

public class Restroom extends HouseDecorator {

    public Restroom(IHouse h) {
        super(h);
    }

    @Override
    public void renovate(){
        super.renovate();
        System.out.print("-> New restroom was constructed in your house ");
    }
}