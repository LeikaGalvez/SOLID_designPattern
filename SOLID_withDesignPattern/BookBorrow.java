package SOLID_withDesignPattern;

public class BookBorrow implements ResourceBorrow{
    @Override
    public void borrow(Student student, Resource resource) {
        System.out.println(student.getName() + " is borrowing the book: "
                + resource.getTitle());
    }
}
