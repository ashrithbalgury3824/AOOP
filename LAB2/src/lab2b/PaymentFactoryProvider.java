package lab2b;

	public class PaymentFactoryProvider {
		public static PaymentFactory getFactory(String paymentType) {
	        if (paymentType.equalsIgnoreCase("NetBanking")) {
	            return new OnlineModePaymentFactory();
	        } else if (paymentType.equalsIgnoreCase("UPI")) {
	            return new UPIPaymentFactory();
	        } else {
	            throw new IllegalArgumentException("Invalid Mode of payment!!");
	        }
	    }
	}
