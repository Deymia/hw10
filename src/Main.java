public class Main {
    public static void main(String[] args) {

        Book book = new Book("Граф Монте-Кристо", "А.Дюма", 1844);
        System.out.println(book);
/*        System.out.println("book.getBookName = " + book.getBookName());
        System.out.println("book.getAuthorName = " + book.getAuthor());
        System.out.println("book.getPublicYear = " + book.getPublicYear());*/

        Book book1 = new Book("Ведьмак", "А. Сапковский", 1992);
        System.out.println(book1);
/*        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.authorName = " + book1.getAuthor());
        System.out.println("book1.publicYear = " + book1.getPublicYear());*/

        Author author = new Author("Александр", "Дюма");
/*        System.out.println("author.firsName = " + author.getFirsName());
        System.out.println("author.lastName = " + author.getLastName());*/

        Author author1 = new Author("Анджей", "Сапковский");
/*        System.out.println("author1.firsName = " + author1.getFirsName());
        System.out.println("author1.lastName = " + author1.getLastName());*/


        book.setPublicYear(1846);
            /*        System.out.println("book.getPublicYear() = " + book.getPublicYear());*/

        System.out.println(book.equals(book1));
        System.out.println(author.equals(author1));


    }
}