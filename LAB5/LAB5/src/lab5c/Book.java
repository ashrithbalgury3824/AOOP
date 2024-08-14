package lab5c;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private int id;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }
}