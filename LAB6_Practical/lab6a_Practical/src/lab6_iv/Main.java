package lab6_iv;
public class Main {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.addPage("Page 1");
        browser.addPage("Page 2");
        browser.addPage("Page 3");

        browser.displayCurrentPage();

        browser.goBack();
        browser.displayCurrentPage();

        browser.goBack();
        browser.displayCurrentPage();

        browser.goForward();
        browser.displayCurrentPage();
    }
}