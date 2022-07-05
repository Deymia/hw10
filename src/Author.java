import java.util.Objects;

public class Author {
    private String firsName;
    private String lastName;

    public Author(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return this.firsName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirsName(java.lang.String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Автор: " + firsName + " " + lastName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firsName.equals(author.firsName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName);
    }
}
