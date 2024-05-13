package SOLID_withDesignPattern;

public class JournalBorrow implements ResourceBorrow{
    @Override
    public void borrow(Student student, Resource resource) {
        System.out.println(student.getName() + " is borrowing the journal: "
                + resource.getTitle());
    }
}
