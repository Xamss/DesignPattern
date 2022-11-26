package ObserverSecond;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();

        new LocalReader(library);
        new OnlineLibrary(library);

        library.addBook("Concrete Mathematics");
        library.addBook("Head First");
    }
}