package lab2b;

import java.util.Scanner;

public class RideSharing {
    public static void main(String[] args) {
        UserSession userSession = UserSession.getInstance();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name and ID below 🔽");
        userSession.setName(sc.nextLine());
        userSession.setId(sc.nextInt());
        sc.nextLine();
        
        System.out.println("Please Select your mode of Transport: [Car] [Bike] [Auto]");
        String vehicleType = sc.nextLine();
        Vehicle vehicle;
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicle = vehicleFactory.createVehicle(vehicleType);
        vehicle.displayType();
        
        System.out.println("Please Enter your Pickup Point & Destination Point below 🔽");
        userSession.setSource(sc.nextLine());
        userSession.setDestination(sc.nextLine());
        
        System.out.println("Please Type 'true' if you want to SHARE YOUR RIDE, if DON'T WANT TO SHARE YOUR RIDE please type 'false'");
        userSession.setShareRide(sc.nextLine());
        
        System.out.println("\n🚨Please Note that Customer Privacy & Safety is out Utmost Priourity🚨\n");    
        
        System.out.println("Please Select your Payment Method: [NetBanking] [UPI]");
        String paymentType = sc.nextLine();
        PaymentFactory paymentFactory = PaymentFactoryProvider.getFactory(paymentType);
        Payment payment = paymentFactory.createPaymentProcess();
        payment.processPayment();
         
        System.out.println("Your ride -> " + vehicleType +", shared -> " + userSession.getShareRide() +
            ", from -> " + userSession.getSource() + ", to -> " + userSession.getDestination() + " , will arrive soon..");
        
        sc.close();
    }
}