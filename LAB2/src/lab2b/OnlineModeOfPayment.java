package lab2b;

public class OnlineModeOfPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Netbanking Payment Completed");
    }
}
