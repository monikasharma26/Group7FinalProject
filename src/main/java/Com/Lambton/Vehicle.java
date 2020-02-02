package Com.Lambton;

import java.util.HashMap;

public class Vehicle {
    public long vehicleIdentificationNumber;
    private String vehicleDescription;
    private String manufacturerName;
    private boolean isSelfDrive;
    private boolean isInsured;
    public HashMap<Integer,String> driver;
    private int noOfSeat;
    public String prefixDetails;
    private String insuranceProviderName;
    private VehicleManagement.FUEL fuelType;
    private VehicleManagement.VEHICLETYPE vehicleType;
    public int baseRate;
    public int ratePerKm;
}
