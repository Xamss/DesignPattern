package DecoratorFirst;

public class BasicHouse implements IHouse {
    @Override
    public void renovate() {
        System.out.print("New house without any renovations ");
    }
}
