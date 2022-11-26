package ObserverFirst;

public class Demo {
    public static void main(String[] args) {
        CoolApplication application = new CoolApplication();

        OrdinaryUser user1 = new OrdinaryUser(application);
        GitTeam gitTeam1 = new GitTeam(application);
        application.setUpdate();
    }
}
