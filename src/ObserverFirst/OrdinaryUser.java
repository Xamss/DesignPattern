package ObserverFirst;

public class OrdinaryUser extends User{

    public OrdinaryUser(CoolApplication application){
        this.application = application;
        this.application.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hi, User!");
        application.getUpdate();
    }
}