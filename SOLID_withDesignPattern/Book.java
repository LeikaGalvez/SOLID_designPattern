package SOLID_withDesignPattern;

public class Book implements Resource{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return "Book";
    }
}
