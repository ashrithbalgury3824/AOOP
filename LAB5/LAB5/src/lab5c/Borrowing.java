package lab5c;

interface Borrowing {
    void borrowBook(Book book, Member member);
    void returnBook(Book book, Member member);
}