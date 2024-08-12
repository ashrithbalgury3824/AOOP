package lab2b;

public class VehicleFactory {
	
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } 
        else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        else if (type.equalsIgnoreCase("Auto")) {
            return new Auto();
        }
        else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}