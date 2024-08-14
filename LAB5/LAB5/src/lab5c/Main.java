package lab5c;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Romeo and Juliet", "William Shakespeare", 1);
        Book book2 = new Book("To Kill a Mockingbird ", "Harper Lee", 2);

        Member member1 = new Member("Ashi", "M1");
        Member member2 = new Member("Karthik", "M2");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(book1, member1);
        library.borrowBook(book2, member2);

        library.returnBook(book1, member1);
    }
}