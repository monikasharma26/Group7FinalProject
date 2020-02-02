package Com.Lambton;

public class Bus extends Vehicle implements IDisplay {


    VehicleManagement.BusType typeOfBus;
    boolean isAccessibilityServiceAvailable;
    boolean isWifiAvailable;

    public Bus(long vehicleIdentificationNumber, String vehicleDescription,
               String manufacturerName, boolean isSelfDrive,
               boolean isInsured,
               int noOfSeat, VehicleManagement.FUEL fuelType,
               VehicleManagement.BusType typeOfBus, boolean isAccessibilityServiceAvailable,
               boolean isWifiAvailable) {
        super(vehicleIdentificationNumber, vehicleDescription,
                manufacturerName, isSelfDrive,
                isInsured,
                noOfSeat, fuelType);
        super.vehicleType = VehicleManagement.VEHICLETYPE.BUS;
        this.typeOfBus = typeOfBus;
        this.isAccessibilityServiceAvailable = isAccessibilityServiceAvailable;
        this.isWifiAvailable = isWifiAvailable;
    }



}
