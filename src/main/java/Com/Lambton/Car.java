package Com.Lambton;


public class Car extends Vehicle implements IDisplay{

    VehicleManagement.CarType carType;
    String carColor;

    public Car(long vehicleIdentificationNumber, String vehicleDescription, String manufacturerName,
               boolean isSelfDrive/*, String driver*/, boolean isInsured,/* String insuranceNameProvider,*/
               int noOfSeat, VehicleManagement.FUEL fuelType,/* Type vehicleType, int baseRate, int ratePerKm,*/
               VehicleManagement.CarType carType, String carColor) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName,
                isSelfDrive, /*driver,*/ isInsured, /*insuranceNameProvider,*/
                noOfSeat, fuelType/*, vehicleType, baseRate, ratePerKm*/);
        super.vehicleType = VehicleManagement.VEHICLETYPE.BUS;
        this.carType = carType;
        this.carColor = carColor;
    }

    public VehicleManagement.CarType getCarType() {
        return carType;
    }

    public void setCarType(VehicleManagement.CarType carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public void display() {
        super.display();
        super.display();
        System.out.println("Car Type: " + getCarType());
        System.out.println("Car Color: " + getCarColor());
        System.out.println();

    }


}
