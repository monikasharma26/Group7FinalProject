package Com.Lambton;

import java.lang.reflect.Type;

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
        super.vehicleType = Type.Car;
        this.carType = carType;
        this.carColor = carColor;
    }

    public VehicleManagement.CarType getCarType() {
        return carType;
    }

}
