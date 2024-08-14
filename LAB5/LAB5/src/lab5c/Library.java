package lab5c;
import java.util.List;
import java.util.ArrayList;

class Library implements Borrowing {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public void borrowBook(Book book, Member member) {
        if (book.isAvailable() && member.getBorrowedBook() == null) {
            book.setAvailability(false);
            member.setBorrowedBook(book);
            System.out.println(member + " borrowed " + book);
        } else {
            System.out.println("Book is not available or member has already borrowed a book.");
        }
    }

    @Override
    public void returnBook(Book book, Member member) {
        if (member.getBorrowedBook() == book) {
            book.setAvailability(true);
            member.setBorrowedBook(null);
            System.out.println(member + " returned " + book);
        } else {
            System.out.println("Member has not borrowed this book.");
        }
    }
}