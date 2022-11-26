package DecoratorSecond;

public class Area extends AttackDecorator {

    public Area(Attack h) {
        super(h);
        super.power*=2;
    }
    @Override
    public void getStats(){
        super.getStats();
        System.out.print("-> Area skill was upgraded ");
    }
}