package lab4a;

interface EventSubject {
    void registerObserver(BidderObserver observer);
    void unregisterObserver(BidderObserver observer);
    void notifyObservers();
}
