package Com.Lambton;

public class Motorcycle  extends Vehicle {
    double topSpeed;
    double milage;
    public Motorcycle(long vehicleIdentificationNumber, String vehicleDescription,
                      String manufacturerName, boolean isSelfDrive,
                      boolean isInsured, int noOfSeat,VehicleManagement.FUEL fuelType,
                      double topSpeed, double milage) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName,
                isSelfDrive, isInsured, noOfSeat, fuelType);
        super.vehicleType = VehicleManagement.VEHICLETYPE.MOTORCYCLE;
        this.topSpeed = topSpeed;
        this.milage = milage;

    }
}

