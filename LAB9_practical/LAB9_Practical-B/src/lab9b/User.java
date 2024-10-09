package lab9b;

public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password, double initialBalance) {
        this.username = username;
        this.password = password;
        this.account = new BankAccount(initialBalance);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getAccount() {
        return account;
    }
}