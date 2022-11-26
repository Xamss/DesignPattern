package DecoratorFirst;

public class HouseDecorator implements IHouse {

    protected IHouse house;

    public HouseDecorator(IHouse c){
        this.house=c;
    }

    @Override
    public void renovate() {
        this.house.renovate();
    }

}