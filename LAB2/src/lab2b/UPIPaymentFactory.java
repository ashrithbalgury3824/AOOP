package lab2b;

public class UPIPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPaymentProcess() {
        return new UPIPayment();
    }
}