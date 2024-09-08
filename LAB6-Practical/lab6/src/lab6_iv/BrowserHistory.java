package lab6_iv;

import java.util.ArrayDeque;

public class BrowserHistory {
    private ArrayDeque<String> history;

    public BrowserHistory() {
        this.history = new ArrayDeque<>();
    }

    public void addPage(String page) {
        history.addLast(page);
        System.out.println("Page added: " + page);
    }

    public void goBack() {
        if (history.size() < 2) {
            System.out.println("Cannot go back.");
            return;
        }
        history.removeLast();
        System.out.println("Going back to: " + history.getLast());
    }

    public void goForward() {
        System.out.println("Forward navigation is not implemented yet.");
    }

    public void displayCurrentPage() {
        if (history.isEmpty()) {
            System.out.println("No pages in history.");
            return;
        }
        System.out.println("Current page: " + history.getLast());
    }
}