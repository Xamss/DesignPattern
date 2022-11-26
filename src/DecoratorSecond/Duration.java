package DecoratorSecond;

public class Duration extends AttackDecorator {

    public Duration(Attack h) {
        super(h);
        super.power+=10;
    }

    @Override
    public void getStats(){
        super.getStats();
        System.out.print("-> Duration skill was upgraded ");
    }
}
