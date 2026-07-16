abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId,
                       String title,
                       String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book book =
                new Book(1, "Java Programming", "James");

        Magazine magazine =
                new Magazine(2, "Tech Monthly", "Editor");

        DVD dvd =
                new DVD(3, "Avengers", "Marvel");

        book.displayItemDetails();
        System.out.println("Loan Duration : "
                + book.getLoanDuration() + " days");

        System.out.println();

        magazine.displayItemDetails();
        System.out.println("Loan Duration : "
                + magazine.getLoanDuration() + " days");

        System.out.println();

        dvd.displayItemDetails();
        System.out.println("Loan Duration : "
                + dvd.getLoanDuration() + " days");
    }
}