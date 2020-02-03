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

    public VehicleManagement.BusType getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(VehicleManagement.BusType typeOfBus) {
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

    public void display() {
        super.display();
        System.out.println("Bus Type: " + getTypeOfBus());
        System.out.println("Accessibility Service Avavilable: " + isAccessibilityServiceAvailable());
        System.out.println("Wifi Available: " + isWifiAvailable());
        System.out.println();
    }

    public void display() {
      
    }

}
