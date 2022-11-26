package ObserverFirst;

import java.util.ArrayList;

public class CoolApplication{

    private ArrayList<User> users = new ArrayList<User>();

    public void getUpdate() {
        System.out.println("New update is available! Please update the application as soon as possible");
    }

    public void setUpdate() {
        notifyAllObservers();
    }

    public void attach(User observer){
        users.add(observer);
    }

    public void notifyAllObservers(){
        for (User observer : users) {
            observer.update();
        }
    }
}