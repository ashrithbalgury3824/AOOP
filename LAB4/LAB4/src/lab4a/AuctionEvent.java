package lab4a;

import java.util.ArrayList;

public class AuctionEvent implements Subject {
    private ArrayList<Observer> observers;
    private String item;
    private String auctionState;

    public AuctionEvent(String item) {
        this.item = item;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.updateBidder(auctionState);
        }
    }

    public void setAuctionState(String auctionState) {
        this.auctionState = auctionState;
        notifyObservers();
    }

    public String getItem() {
        return this.item;
    }
}
