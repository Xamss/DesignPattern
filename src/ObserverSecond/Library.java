package ObserverSecond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library{

    private ArrayList<LibraryObserver> libraryObservers = new ArrayList<LibraryObserver>();
    private ArrayList<String> state = new ArrayList<String>(Arrays.asList("Catcher in the Rye", "Path of Abai"));

    public List<String> getState() {
        return state;
    }

    public void addBook(String book) {
        this.state.add(book);
        notifyAllObservers();
    }

    public void attach(LibraryObserver observer){
        libraryObservers.add(observer);
    }

    public void notifyAllObservers(){
        for (LibraryObserver observer : libraryObservers) {
            observer.update();
        }
    }
}


