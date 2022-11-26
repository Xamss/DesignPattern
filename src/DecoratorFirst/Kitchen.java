package DecoratorFirst;

public class Kitchen extends HouseDecorator {

    public Kitchen(IHouse h) {
        super(h);
    }

    @Override
    public void renovate(){
        super.renovate();
        System.out.print("-> New kitchen is ready to use ");
    }
}