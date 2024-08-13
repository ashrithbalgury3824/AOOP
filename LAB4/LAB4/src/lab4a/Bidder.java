package lab4a;

public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void updateBidder(String auctionState) {
        String emoji = "";
        if (auctionState.contains("available")) {
            emoji = "🔔";
        } else if (auctionState.contains("started")) {
            emoji = "🚀";
        } else if (auctionState.contains("ended")) {
            emoji = "🏁";
        }
        System.out.println("[" + name + "] Update: " + emoji + " " + auctionState);
    }
}
