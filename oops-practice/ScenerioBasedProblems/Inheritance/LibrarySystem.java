class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {

    private String authorName;
    private String bio;

    public Author(String title,
                  int publicationYear,
                  String authorName,
                  String bio) {

        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Book Title : " + title);
        System.out.println("Publication Year : " + publicationYear);
        System.out.println("Author : " + authorName);
        System.out.println("Bio : " + bio);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Author book = new Author(
                "Java Programming",
                2024,
                "James Gosling",
                "Father of Java"
        );

        book.displayInfo();
    }
}