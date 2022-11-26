package DecoratorSecond;

public class AttackDecorator extends Attack {

    protected Attack attack;



    public AttackDecorator(Attack c){
        this.attack = c;
    }

    @Override
    public void getStats() {
        this.attack.getStats();
    }

}