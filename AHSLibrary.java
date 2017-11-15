public class AHSLibrary
{
    public static void main(String[]args) {
        Library acalanes = new Library ("Acalanes Library", 30);
        Author eric = new Author ("Eric", 21);
        Book a = new Book ("Book a", eric);
        Author derrick = new Author ("Derrick", 22);
        Book b = new Book ("Book b", derrick);
        acalanes.addBook(a);
        acalanes.addBook(b);
        System.out.println(acalanes);
    }
}
