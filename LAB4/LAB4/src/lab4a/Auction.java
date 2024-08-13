package lab4a;

public class Auction {
    public static void main(String[] args) {
        AuctionEvent item = new AuctionEvent("Antique Flask");
        Bidder bidder1 = new Bidder("Sam");
        Bidder bidder2 = new Bidder("John");
        
        item.registerObserver(bidder1);
        item.registerObserver(bidder2);

        item.setAuctionState("The item '" + item.getItem() + "' is now available for bidding.");

        item.setAuctionState("Bidding has officially started!");

        item.unregisterObserver(bidder2);

         item.setAuctionState("The bidding has ended.");
    }
}
