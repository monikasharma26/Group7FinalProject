package Com.Lambton;

import java.lang.reflect.Type;

public class Bus extends Vehicle implements IDisplay {


    BusType typeOfBus;
    boolean isAccessibilityServiceAvailable;
    boolean isWifiAvailable;

    public Bus(long vehicleIdentificationNumber, String vehicleDescription,
               String manufacturerName, boolean isSelfDrive,
               boolean isInsured,
               int noOfSeat, Fuel fuelType,
               BusType typeOfBus, boolean isAccessibilityServiceAvailable,
               boolean isWifiAvailable) {
        super(vehicleIdentificationNumber, vehicleDescription,
                manufacturerName, isSelfDrive,
                isInsured,
                noOfSeat, fuelType);
        super.vehicleType = Type.Bus;
        this.typeOfBus = typeOfBus;
        this.isAccessibilityServiceAvailable = isAccessibilityServiceAvailable;
        this.isWifiAvailable = isWifiAvailable;
    }



}
