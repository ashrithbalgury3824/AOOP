package lab5c;

class Member {
    private String name;
    private String memberId;
    private Book borrowedBook;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                '}';
    }
}