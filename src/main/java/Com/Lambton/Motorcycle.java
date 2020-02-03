package Com.Lambton;

public class Motorcycle  extends Vehicle implements IDisplay{

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
    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Top Speed: " + getTopSpeed()+"km/hr");
        System.out.println("Mileage: " + getMilage()+" mpg");
        System.out.println();
    }

}

