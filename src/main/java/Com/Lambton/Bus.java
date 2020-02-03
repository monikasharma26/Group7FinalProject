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

    public BusType getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(BusType typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public boolean isAccessibilityServiceAvailable() {
        return isAccessibilityServiceAvailable;
    }

    public void setAccessibilityServiceAvailable(boolean accessibilityServiceAvailable) {
        isAccessibilityServiceAvailable = accessibilityServiceAvailable;
    }

    public boolean isWifiAvailable() {
        return isWifiAvailable;
    }

    public void setWifiAvailable(boolean wifiAvailable) {
        isWifiAvailable = wifiAvailable;
    }

}
