package ObserverFirst;

public class GitTeam extends User{

    public GitTeam(CoolApplication application){
        this.application = application;
        this.application.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Attention Git Developers!");
        application.getUpdate();
    }
}