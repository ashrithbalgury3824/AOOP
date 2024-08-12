package lab2b;

public class OnlineModePaymentFactory extends PaymentFactory {
    @Override
    public Payment createPaymentProcess() {
        return new OnlineModeOfPayment();
    }
}