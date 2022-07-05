import java.util.Objects;

public class Book {
        private String bookName;
        private String author;
        private int publicYear;

        public Book(String bookName, String author, int publicYear) {
                this.bookName = bookName;
                this.author = author;
                this.publicYear = publicYear;
        }

        public String getBookName() {
                return this.bookName;
        }

        public String getAuthor() {
                return this.author;
        }

        public int getPublicYear() {
                return this.publicYear;
        }

        public void setPublicYear(int publicYear) {
                this.publicYear = publicYear;
        }

        public String toString() {
                return "Название: " +this.bookName + "\n Автор: " + this.author + "\n Год публикации: " + this.publicYear;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Book book = (Book) o;
                return bookName.equals(book.bookName);
        }

        @Override
        public int hashCode() {
                return Objects.hash(bookName);
        }

        }
