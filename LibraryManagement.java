class LibraryItems {
    private int id;
    String title;
    int year;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    void DisplayDetails() {
        System.out.println(id+ " "+ title + " " + year);
    }
}

class Book extends LibraryItems {
    private String author;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    void DisplayDetails() {
        System.out.println(getId()+ " "+title + " " + year + " " + author);
    }
}

class Magazine extends LibraryItems {
    String issue;
    int cost;
    void DisplayDetails() {
        System.out.println(getId()+ " "+title + " " + year + " " + issue + " " + cost);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();

        book.setId(001);
        book.title = "Peace world";
        book.year = 2003;
        book.setAuthor("Daniel");

        book.DisplayDetails();

        
        magazine.setId(002);
        magazine.title = "Your Time";
        magazine.year = 2004;
        magazine.issue = "22-Jun-2003";
        magazine.cost = 20;

        magazine.DisplayDetails();
    }
}