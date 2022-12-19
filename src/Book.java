public class Book implements Printable {

    public String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public void print() {
        System.out.println(nameBook);

    }

    public static Printable[] printBooks(Printable[] printableBook){
        return printableBook;

    }
}
