package ObserverSecond;

import java.util.List;

public class LocalReader extends LibraryObserver{

    public LocalReader(Library library){
        this.library = library;
        this.library.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hello, Reader! We have new books for you:");
        List<String> state = library.getState();
        for (String book : state) {
            System.out.println(book);
        }
    }
}