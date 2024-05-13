package SOLID_withDesignPattern;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        Resource book1 = new Book("To Kill a Mockingbird");
        Resource journal1 = new Journal("Nature");

        Map<String, ResourceBorrow> resourceTypes = new HashMap<>();
        resourceTypes.put("Book", new BookBorrow());
        resourceTypes.put("Journal", new JournalBorrow());

        Library library = new Library(resourceTypes);

        Student student = new Student("Leika");

        library.borrowResource(student, book1);
        library.borrowResource(student, journal1);
    }
}
