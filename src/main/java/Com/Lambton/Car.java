package Com.Lambton;

public class Car extends Vehicle{

    public VehicleManagement.CarType carType;
    public String carColor;

    public Car(String vehicleIdentificationNumber, String vehicleDescription, String manufacturerName,
               boolean isSelfDrive/*, String driver*/, boolean isInsured,/* String insuranceNameProvider,*/
               int noOfSeat, VehicleManagement.FUEL fuelType,/* Type vehicleType, int baseRate, int ratePerKm,*/
               VehicleManagement.CarType carType, String carColor) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName,
                isSelfDrive,isInsured,noOfSeat, fuelType);
        super.vehicleType = VehicleManagement.VEHICLETYPE.CAR;
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
    public String  display() {
        super.display();
        System.out.println("Car Type: " + getCarType());
        System.out.println("Car Color: " + getCarColor());
        System.out.println();
        return toString();

    }


}
