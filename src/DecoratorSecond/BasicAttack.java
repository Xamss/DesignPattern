package DecoratorSecond;

public class BasicAttack extends Attack {

    public BasicAttack(){
        super.power = 4;
    }

    @Override
    public void getStats() {
        System.out.print("Your Attack's power is now " + super.power);
    }
}
