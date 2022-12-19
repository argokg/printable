public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Книга 1");
        Book book2 = new Book("Книга 2");
        Book book3 = new Book("Книга 3");

        Magazine magazine1  = new Magazine("Журнал 1");
        Magazine magazine2  = new Magazine("Журнал 2");
        Magazine magazine3  = new Magazine("Журнал 3");

        Printable[] printable = new Printable[]{book1, book2,book3,magazine1,magazine2,magazine3};
        Printable[] printableMagazine = new Printable[]{magazine1, magazine2, magazine3};
        Printable[] printableBook = new Printable[]{book1, book2, book3};


        for (Printable a:printable) {
            a.print();
        }
        System.out.println("-------------------");

        for (Printable b:printableMagazine) {
            b.print();
        }
        System.out.println("-------------------");

        for (Printable c:printableBook) {
            c.print();
        }


    }
}