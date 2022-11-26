package ObserverSecond;

import java.util.List;

public class OnlineLibrary extends LibraryObserver{

    public OnlineLibrary(Library library){
        this.library = library;
        this.library.attach(this);
    }

    @Override
    public void update() {
        System.out.println("New updates came up in our store:");
        List<String> state = library.getState();
        for (String book : state) {
            System.out.println(book);
        }
    }
}